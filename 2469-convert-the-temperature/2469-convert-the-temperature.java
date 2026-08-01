class Solution {
    public double[] convertTemperature(double celsius) {
        double[] cell=new double[2];
        cell[0]=celsius + 273.15;
        cell[1]=celsius * 1.80 +32.00;
                return cell;
    }
}