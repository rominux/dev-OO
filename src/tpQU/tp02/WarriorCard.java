package tpQU.tp02;

/** carte de guerrier 👍 */
public class WarriorCard {
    private String name;
    private int strength;
    private int agility;

    /**
     * Crée une carte complètement spécifiée.
     * @param name le nom sur la carte
     * @param s la force
     * @param ag l'agilité
     */
    public WarriorCard(String name, int s, int ag) {
        this.name = name;
        this.strength = s;
        this.agility = ag;
    }

    /** 
     * Détermine si la carte guerrier passée en paramètre est équivalente à la carte courante,
     * uniquement basée sur le nom du guerrier représentée sur la carte.
     * @param obj l'objet a comparer
     * @return si c'est égal ou pas
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        WarriorCard other = (WarriorCard) obj;
        if (other.name == null) return false;
        if (!other.name.equals(this.name)) return false;
        return true;
    }

    /** 
     * @return la représentation textuelle d’une carte guerrier, contenant son nom, sa valeur de force
     * et sa valeur d’agilité sous la forme nom[S=strength,A=agility].
     */
    @Override
    public String toString() {
        return this.name + "[S=" + this.strength + ",A=" + this.agility + "]";
    }

    /**
     * @param other l'autre carte avec lequel on compare
     * @return 0 si les deux guerriers ont une force équivalente ;
     * &lt; 0 si la force du guerrier courant est inférieure à celle de celui passé en paramètre ;
     * &gt; 0 si la force du guerrier courant est supérieure à celle de celui passé en paramètre.
     */
    public int compareStrength(WarriorCard other) {
        return this.strength - other.strength;
    }
    /**
     * @param other l'autre carte avec lequel on compare
     * @return 0 si les deux guerriers ont une agilité équivalente ;
     * &lt; 0 si l’agilité du guerrier courant est inférieure à celle de celui passé en paramètre ;
     * &gt; 0 si l’agilité du guerrier courant est supérieure à celle de celui passé en paramètre.
     */
    public int compareAgility(WarriorCard other) {
        return this.agility - other.agility;
    }
}
