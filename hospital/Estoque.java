package hospital;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Equipamento> Equipamentos;
    private List<Medicamentos> Medicamentos;

    public Estoque(List<Equipamento> Equipamentos, List<Medicamentos> Medicamentos) {
        this.Equipamentos = new ArrayList<Equipamento>();
        this.Medicamentos = new ArrayList<Medicamentos>();
    }

    public List<Equipamento> getEquipamentos() {
        return Equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        Equipamentos = equipamentos;
    }

    public List<Medicamentos> getMedicamentos() {
        return Medicamentos;
    }

    public void setMedicamentos(List<Medicamentos> medicamentos) {
        Medicamentos = medicamentos;
    }

}
