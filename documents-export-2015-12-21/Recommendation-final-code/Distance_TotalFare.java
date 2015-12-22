package com.predictionmarketing.itemrecommend;

import java.io.File;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.EuclideanDistanceSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;


public class Distance_TotalFare {

	public static void main(String[] args) {
		try {
			
			
			
			DataModel model = new FileDataModel (new File("data/Distance-TotalFare.csv"));
			ItemSimilarity itemSimilarity = new EuclideanDistanceSimilarity (model);
			Recommender itemRecommender = new GenericItemBasedRecommender(model,itemSimilarity);
			int distance = 16600;
			List<RecommendedItem> itemRecommendations = itemRecommender.recommend(distance, 1);
			for (RecommendedItem itemRecommendation : itemRecommendations) {
			System.out.println("For Yellow Taxi>>When trip distance is "+ distance +" meters "+ "the estimated fair is " + itemRecommendation.getValue() + "(Tolls are not included)");
			}
			
			
			
		} catch (IOException e) {
			System.out.println("There was an error.");
			e.printStackTrace();
		} catch (TasteException e) {
			System.out.println("There was a Taste Exception");
			e.printStackTrace();
		}
		

	}

}