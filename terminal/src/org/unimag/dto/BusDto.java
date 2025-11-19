package org.unimag.dto;

public class BusDto {
    
    private int idBus;
    private String modeloBus;
    private EmpresaDto empresaBus;
    private String nombreImagenPublicoBus;
    private String nombreImagenPrivadoBus;
    private int cantidadViajeBus;

    public int getCantidadViajeBus() {
        return cantidadViajeBus;
    }

    public void setCantidadViajeBus(int cantidadViajeBus) {
        this.cantidadViajeBus = cantidadViajeBus;
    }

    public BusDto() {
    }

    public BusDto(int idBus, String modeloBus, EmpresaDto empresaBus, String nombreImagenPublicoBus, String nombreImagenPrivadoBus, int cantidadViajeBus) {
        this.idBus = idBus;
        this.modeloBus = modeloBus;
        this.empresaBus = empresaBus;
        this.nombreImagenPublicoBus = nombreImagenPublicoBus;
        this.nombreImagenPrivadoBus = nombreImagenPrivadoBus;
        this.cantidadViajeBus = cantidadViajeBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public void setModeloBus(String modeloBus) {
        this.modeloBus = modeloBus;
    }

    public void setEmpresaBus(EmpresaDto empresaBus) {
        this.empresaBus = empresaBus;
    }

    public void setNombreImagenPublicoBus(String nombreImagenPublicoBus) {
        this.nombreImagenPublicoBus = nombreImagenPublicoBus;
    }

    public void setNombreImagenPrivadoBus(String nombreImagenPrivadoBus) {
        this.nombreImagenPrivadoBus = nombreImagenPrivadoBus;
    }

    public int getIdBus() {
        return idBus;
    }

    public String getModeloBus() {
        return modeloBus;
    }

    public EmpresaDto getEmpresaBus() {
        return empresaBus;
    }

    public String getNombreImagenPublicoBus() {
        return nombreImagenPublicoBus;
    }

    public String getNombreImagenPrivadoBus() {
        return nombreImagenPrivadoBus;
    }

    @Override
    public String toString() {
        if (idBus == 0) {
            return "Seleccione el Asiento";
        }
        return "Bus"+idBus+" de "+empresaBus.getNombreEmpresa();
    }
    
}
