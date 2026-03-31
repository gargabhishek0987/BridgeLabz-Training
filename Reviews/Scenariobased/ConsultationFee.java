class ConsultationFee {
    public int FeeCalculate(int baseFee , int experience){
        return baseFee + (experience *20);

    }

   

}
class ConsultationFeeforSpecilist{
     public int FeeCalculate(int baseFee , int experience , boolean isSpecialist){
        if(isSpecialist){
            return baseFee + (experience *30);
        }else{
            return baseFee + (experience *15);
        }
    }
}
