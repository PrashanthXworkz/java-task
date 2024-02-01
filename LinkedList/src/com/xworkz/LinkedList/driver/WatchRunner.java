package com.xworkz.LinkedList.driver;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;



public class WatchRunner {
	

	public static void main(String[] args) {
		
		      LinkedList<Watch> watchCollection = new LinkedList<>();

		       
		        watchCollection.add(new Watch("Rolex", "Classic", 5000.0));
		        watchCollection.add(new Watch("Seiko", "Sporty", 200.0));
		        watchCollection.add(new Watch("Casio", "Digital", 50.0));
		        watchCollection.add(new Watch("Omega", "Luxury", 8000.0));
		        watchCollection.add(new Watch("Fossil", "Fashion", 150.0));
		        watchCollection.add(new Watch("Apple", "Smart", 400.0));
		        watchCollection.add(new Watch("Tag Heuer", "Elegant", 3000.0));
		        watchCollection.add(new Watch("Timex", "Casual", 30.0));
		        watchCollection.add(new Watch("Citizen", "Dress", 250.0));
		        watchCollection.add(new Watch("Swatch", "Colorful", 80.0));

		       
		        Collections.sort(watchCollection, Watch::compareByName);
		        System.out.println("Sorted by name:\n" + watchCollection);

		       
		        Collections.sort(watchCollection, Watch::compareByPrice);
		        System.out.println("\nSorted by price:\n" + watchCollection);

		        
		        double targetPrice = 200.0;
		        Watch foundWatchByPrice = findWatchByPrice(watchCollection, targetPrice);
		        System.out.println("\nWatch details with price $" + targetPrice + ":\n" + foundWatchByPrice);

		        
		        String targetCompanyName = "Rolex";
		        Watch foundWatchByCompanyName = findWatchByCompanyName(watchCollection, targetCompanyName);
		        System.out.println("\nWatch details with companyName " + targetCompanyName + ":\n" + foundWatchByCompanyName);

		       
		        String watchNameToRemove = "Casio";
		        removeWatchByName(watchCollection, watchNameToRemove);
		        System.out.println("\nAfter removing watch with name " + watchNameToRemove + ":\n" + watchCollection);

		       
		        double priceToReplace = 150.0;
		        Watch replacementWatch = new Watch("NewBrand", "NewModel", 200.0);
		        replaceWatchByPrice(watchCollection, priceToReplace, replacementWatch);
		        System.out.println("\nAfter replacing watch with price $" + priceToReplace + ":\n" + watchCollection);
		    }

		   

		    static class Watch {
		        private String companyName;
		        private String modelName;
		        private double price;

		        public Watch(String string, String string2, double d) {
					// TODO Auto-generated constructor stub
				}

		        static int compareByName(Watch w1, Watch w2) {
		            return w1.companyName.compareTo(w2.companyName);
		        }

		        static int compareByPrice(Watch w1, Watch w2) {
		            return Double.compare(w1.price, w2.price);
		        }
                 public Object getCompanyName() {
					return null;
				}

             public double getPrice() {
					return 0;
				}
		    }

		    
		    private static Watch findWatchByPrice(LinkedList<Watch> watches, double targetPrice) {
		        for (Watch watch : watches) {
		            if (watch.getPrice() == targetPrice) {
		                return watch;
		            }
		        }
		        return null; 
		    }

		    
		    private static Watch findWatchByCompanyName(LinkedList<Watch> watches, String targetCompanyName) {
		        for (Watch watch : watches) {
		            if (watch.getCompanyName().equals(targetCompanyName)) {
		                return watch;
		            }
		        }
		        return null; 
		    }

		    
		    private static void removeWatchByName(LinkedList<Watch> watches, String watchNameToRemove) {
		        watches.removeIf(watch -> watch.getCompanyName().equals(watchNameToRemove));
		    }

		    
		    private static void replaceWatchByPrice(LinkedList<Watch> watches, double priceToReplace, Watch replacementWatch) {
		        for (int i = 0; i < watches.size(); i++) {
		            Watch watch = watches.get(i);
		            if (watch.getPrice() == priceToReplace) {
		                watches.set(i, replacementWatch);
		            }
		        }
		    }
		}


