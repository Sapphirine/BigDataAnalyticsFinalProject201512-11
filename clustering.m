cmx=dropoff_longitude;
cmy=dropoff_latitude;
X=[cmx cmy];
[idx,D]=kmeans(X,5);
D;
for i=1:5
    c1x=cmx.*(idx==i);
    c1y=cmy.*(idx==i);
    c1x=bigdata_removeZero(c1x);
    c1y=bigdata_removeZero(c1y);
    plot(c1x,c1y,'.y','markersize',4)
    %axis([-74.05 -73.86 40.6806855 40.802])
    set(gcf,'color','none');%external
    set(gca,'color','none');%cave
    set(gca,'xtick',[],'xticklabel',[])%??x??
    set(gca,'ytick',[],'yticklabel',[])%??y??
    hold on 
end


