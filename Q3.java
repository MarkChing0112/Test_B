package Test_B;

public class Q3{
    public static void main(String[] args) {
        int[] cartonBoxDimensions = { 320, 260, 200 };
        int[] productDimensions = { 210, 35, 35 };
        int maxQuantity = calculateMaxQuantity(cartonBoxDimensions, productDimensions);
        System.out.println("Maximum quantity of the product in the carton box: " + maxQuantity);
    }

    public static int calculateMaxQuantity(int[] cartonBoxDimensions, int[] productDimensions) {
        int maxQuantity = 0;
        //declear value of the box
        int boxLength = cartonBoxDimensions[0];
        int boxWidth = cartonBoxDimensions[1];
        int boxHeight = cartonBoxDimensions[2];
        //declear value of the product
        int productLength = productDimensions[0];
        int productWidth = productDimensions[1];
        int productHeight = productDimensions[2];
        //calculate the max quantity and declear the variable
        int maxQuantityByLength = boxLength/productLength;
        int maxQuantityByWidth = boxWidth/productWidth;
        int maxQuantityByHeight = boxHeight/productHeight;

        maxQuantity = maxQuantityByLength * maxQuantityByWidth * maxQuantityByHeight;

        return maxQuantity;
    }
}