package controllers;

import models.Brand;

public class BrandController {
  public Brand[] sortBubbleDesc(Brand[] brands) {
    for(int i=0; i<brands.length; i++){
      boolean swap = false;
      for(int j =0; j<brands.length-1-i;j++){
        if(brands[j].getTotalValidYears()<brands[j+1].getTotalValidYears()){
          Brand aux = brands[j];
          brands[j]=brands[j+1];
          brands[j+1]=aux;
          swap=true;
        }
        
      }
    if(!swap){
      break;
    }
  }

  public Brand binarySearchByValidYears(Brand[] brands, int validYears,boolean isAscending) {
    int bajo = 0;
    int alto = brands.length-1;
}
}
}