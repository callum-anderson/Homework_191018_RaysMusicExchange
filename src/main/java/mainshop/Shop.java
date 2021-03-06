package mainshop;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stockList;

    public Shop(){
        this.stockList = new ArrayList<>();
    }

    public void addStockItem(ISell stockItem){
        this.stockList.add(stockItem);
    }

    public void removeStockItem(ISell stockItem){
        this.stockList.remove(stockItem);
    }

    public int stockCount(){
        return this.stockList.size();
    }

    public double totalPotentialProfit(){
        double profit = 0;
        for (ISell stockItem: this.stockList){
            profit += stockItem.getMarkup();
        }
        return profit;
    }

}
