public class CarFactory {
    enum Cars {
        BMW,
        Audi,
        Koeningsegg,
        Volkswagen,
        Scania
    }
    public Build getCar(Cars carType){

        if(carType == null){
            return null;
        }
        if(carType == Cars.BMW){
            return new BMW();

        } else if (carType == Cars.Audi){
            return new Audi();

        } else if(carType == Cars.Koeningsegg){
            return new Koeningsegg();
        }
     else if(carType == Cars.Volkswagen){
        return new Volkswagen();
    }
     else if(carType == Cars.Scania){
        return new Scania();
    }


        return null;

    }
}
