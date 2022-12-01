package com.enriquelastra24;

import com.enriquelastra24.dao.ClienteDao;
import com.enriquelastra24.dao.CocheDao;
import com.enriquelastra24.dao.RevisionDao;
import com.enriquelastra24.model.Cliente;
import com.enriquelastra24.model.Coche;
import com.enriquelastra24.model.Revision;
import com.enriquelastra24.util.ConectorBD;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente("1450", "Carlos Peréz", "Cochabamba", "Av. Ayacucho #2231", 74452229);
       Cliente laura = new Cliente("1451", "Carlos Peréz", "Cochabamba", "Av. Ayacucho #2231", 74452229);
        Coche ferrari2 = new Coche ("15151","Ferrari","TH800","rojo",200004,"1450");
       Coche mercedes = new Coche ("AH0142","Ferrari","TH800","rojo",200004,"1451");
        Revision tecnica = new Revision("29994","No sirve","Correcto","Cambiados","15151");

        ClienteDao clienteDao = new ClienteDao();
       CocheDao cocheDao = new CocheDao();
        RevisionDao revisionDao = new RevisionDao();
        //CREATE
        clienteDao.addCliente(laura);
       clienteDao.addCliente(cliente);

        cocheDao.addCoche(ferrari2);
        cocheDao.addCoche(mercedes);

        revisionDao.addRevision(tecnica);

        //READ
        //List<Cliente> clientes = clienteDao.getAllClientes();
        //for (int i = 0; i < clientes.size(); i++){
        //    Cliente cliente = clientes.get(i);

        //    System.out.println(cliente);
        //}

        /*
        List<Coche> coches = cocheDao.getAllCoches();
        for (int i = 0; i < coches.size(); i++){
            Coche coche = coches.get(i);

            System.out.println(coche);
        }
         */

        /*
        List<Revision> revisiones = revisionDao.getAllRevisiones();
        for (int i=0; i< revisiones.size(); i++){
            Revision revision = revisiones.get(i);

            System.out.println(revision);
        }
         */


        //UPDATE
        //Cliente cliente = new Cliente("1450", "Fenando Torrico", "La Paz", "Av. 6Agosto #2231", 73772229);
        //clienteDao.updateCliente(cliente);

        //Coche coche = new Coche ("AH0142" , "tOHSIBApowa" , "II9s11", "Negro", 12000,"1451");
        //cocheDao.updateCoche(coche);

        //Revision revision = new Revision("29994", "Correctos", "Correcto", "Repuestos", "AH0142");
        //revisionDao.updateRevision(revision);

        //DELETE
        //clienteDao.deleteCliente("1456-1B");
        //clienteDao.deleteCliente("1450");

        //cocheDao.deleteCoche("AH0122");

        //revisionDao.deleteRevision("29994");
    }
}