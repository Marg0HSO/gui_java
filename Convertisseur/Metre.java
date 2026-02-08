package Convertisseur;

public class Metre {
    
    private double value;
    private Unite unite;

    // Constructeur

    public Metre(double value, Unite unite){
        this.value = value;
        this.unite = unite;
    }

    // Getters

    public double getValue(){
        return this.value;
    }

    public Unite getUnite(){
        return this.unite;
    }

    // Convertisseurs

    private Metre convertKm(Unite convertUnite){
        if (this.unite == Unite.KILOMETRE){
            switch (convertUnite) {
                case Unite.HECTOMETRE: return new Metre(this.value / 10, Unite.HECTOMETRE);
                case Unite.DECAMETRE: return new Metre(this.value / 100, Unite.DECAMETRE);
                case Unite.METRE: return new Metre(this.value / 1000, Unite.METRE);
                case Unite.DECIMETRE: return new Metre(this.value / 10000, Unite.DECIMETRE);
                case Unite.CENTIMETRE: return new Metre(this.value / 100000, Unite.CENTIMETRE);
                case Unite.MILLIMETRE: return new Metre(this.value / 1000000, Unite.MILLIMETRE);
                default: return this;
            }
        } else {
            return this;
        }
    }

    private Metre convertHm(Unite convertUnite){
        if (this.unite == Unite.HECTOMETRE){
            switch (convertUnite) {
                case Unite.KILOMETRE: return new Metre(this.value * 10, Unite.KILOMETRE);
                case Unite.DECAMETRE: return new Metre(this.value / 10, Unite.DECAMETRE);
                case Unite.METRE: return new Metre(this.value / 100, Unite.METRE);
                case Unite.DECIMETRE: return new Metre(this.value / 1000, Unite.DECIMETRE);
                case Unite.CENTIMETRE: return new Metre(this.value / 10000, Unite.CENTIMETRE);
                case Unite.MILLIMETRE: return new Metre(this.value / 100000, Unite.MILLIMETRE);
                default: return this;
            }
        } else {
            return this;
        }
    }

    // methods

    public void changeUnite(Unite newUnite){
        switch (this.unite) {
            case Unite.KILOMETRE:
                
                break;
        
            case Unite.HECTOMETRE:

                break;

            case Unite.DECAMETRE:

                break;
                
            case Unite.METRE:

                break;

            case Unite.DECIMETRE:

                break;

            case Unite.CENTIMETRE:

                break;

            case Unite.MILLIMETRE:

                break;
                
            default:
                break;
        }    
    }
}
