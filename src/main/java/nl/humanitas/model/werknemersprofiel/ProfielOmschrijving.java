package nl.humanitas.model.werknemersprofiel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProfielOmschrijving {

    @Id
    private String id;
    private String algemeenProfiel;
    private String capaciteit;
    private String werkervaring;
    private String scholingOfManierVanLeren;
    private String socialeContext;
    private String identiteitPersoonlijkheidEnCluster;
    private String WensenMotievenEnPerspectief;

    public ProfielOmschrijving() {
    }

    public ProfielOmschrijving(String algemeenProfiel, String capaciteit, String werkervaring,
                               String scholingOfManierVanLeren, String socialeContext,
                               String identiteitPersoonlijkheidEnCluster, String wensenMotievenEnPerspectief) {
        this.algemeenProfiel = algemeenProfiel;
        this.capaciteit = capaciteit;
        this.werkervaring = werkervaring;
        this.scholingOfManierVanLeren = scholingOfManierVanLeren;
        this.socialeContext = socialeContext;
        this.identiteitPersoonlijkheidEnCluster = identiteitPersoonlijkheidEnCluster;
        WensenMotievenEnPerspectief = wensenMotievenEnPerspectief;
    }

    public String getAlgemeenProfiel() {
        return algemeenProfiel;
    }

    public void setAlgemeenProfiel(String algemeenProfiel) {
        this.algemeenProfiel = algemeenProfiel;
    }

    public String getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(String capaciteit) {
        this.capaciteit = capaciteit;
    }

    public String getWerkervaring() {
        return werkervaring;
    }

    public void setWerkervaring(String werkervaring) {
        this.werkervaring = werkervaring;
    }

    public String getScholingOfManierVanLeren() {
        return scholingOfManierVanLeren;
    }

    public void setScholingOfManierVanLeren(String scholingOfManierVanLeren) {
        this.scholingOfManierVanLeren = scholingOfManierVanLeren;
    }

    public String getSocialeContext() {
        return socialeContext;
    }

    public void setSocialeContext(String socialeContext) {
        this.socialeContext = socialeContext;
    }

    public String getIdentiteitPersoonlijkheidEnCluster() {
        return identiteitPersoonlijkheidEnCluster;
    }

    public void setIdentiteitPersoonlijkheidEnCluster(String identiteitPersoonlijkheidEnCluster) {
        this.identiteitPersoonlijkheidEnCluster = identiteitPersoonlijkheidEnCluster;
    }

    public String getWensenMotievenEnPerspectief() {
        return WensenMotievenEnPerspectief;
    }

    public void setWensenMotievenEnPerspectief(String wensenMotievenEnPerspectief) {
        WensenMotievenEnPerspectief = wensenMotievenEnPerspectief;
    }
}
