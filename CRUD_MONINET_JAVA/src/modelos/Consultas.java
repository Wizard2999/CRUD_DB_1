/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Consultas extends ConexionDB {
//Metodos para cargar todas las tablas de la BD moninet------------INICIO

    //Metodo para cargar la tabla clientes que se encuentra en la base de datos
    public void CargarClientes(JTable tbClientes, Cliente cliente, ArrayList<Cliente> listaClientes) {
        try {
            DefaultTableModel dtm = new DefaultTableModel();
            String cabecera[] = {
                "ID",
                "NOMBRE",
                "CEDULA",
                "DIRECCION",
                "TELEFON",
                "CORREO"
            };
            dtm.setColumnIdentifiers(cabecera);
            Connection connection = getConexion();
            Statement stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM `cliente`");

            listaClientes.clear();
            Object[] row = new Object[6];
            while (resultado.next()) {
                cliente.setIdCliente(resultado.getString("IdCliete"));
                cliente.setNombre(resultado.getString("Nombre"));
                cliente.setCedula(resultado.getString("Cedula"));
                cliente.setDireccion(resultado.getString("Direccion"));
                cliente.setTelefono(resultado.getString("Telefono"));
                cliente.setCorreo(resultado.getString("Correo"));
                row[0] = cliente.getIdCliente();
                row[1] = cliente.getNombre();
                row[2] = cliente.getCedula();
                row[3] = cliente.getDireccion();
                row[4] = cliente.getTelefono();
                row[5] = cliente.getCorreo();
                listaClientes.add(cliente);
                dtm.addRow(row);
            }
            tbClientes.setModel(dtm);
            resultado.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodo para cargar la tabla contratos que se encuentra en la base de datos
    public void CargarContratos(JTable tbContratos, Contratos contratos, ArrayList<Contratos> listaContratos) {
        try {
            Connection connection = getConexion();
            Statement stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM `contrato`");
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            listaContratos.clear();
            String[] cabera = {
                "ID CONTRATO",
                "PAQUETE",
                "FECHA INICIO",
                "FECHA FINALIZACION",
                "ESTADO",
                "ID CLIENTE"
            };
            defaultTableModel.setColumnIdentifiers(cabera);
            while (resultado.next()) {
                Object[] row = new Object[6];
                contratos.setIdContrato(resultado.getString("IdContrato"));
                contratos.setPaquete(resultado.getString("IdPaquete"));
                contratos.setFecha_inicio(resultado.getString("Fecha_inicio"));
                contratos.setFecha_finalizacion(resultado.getString("Fecha_finalizacion"));
                contratos.setEstado(resultado.getString("Estadoo"));
                contratos.setIdCliete(resultado.getString("IdCliete"));
                row[0] = contratos.getIdContrato();
                row[1] = contratos.getPaquete();
                row[2] = contratos.getFecha_inicio();
                row[3] = contratos.getFecha_finalizacion();
                row[4] = contratos.getEstado();
                row[5] = contratos.getIdCliete();
                listaContratos.add(contratos);
                defaultTableModel.addRow(row);
            }
            tbContratos.setModel(defaultTableModel);
            resultado.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodo para cargar la tabla pagos que se encuentra en la base de datos
    public void CargarPago(JTable tbPagos, Pagos pagos, ArrayList<Pagos> listaPagos) {
        try {
            Connection connection = getConexion();
            Statement stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM `pagos`");
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            listaPagos.clear();
            String[] cabecera = {
                "ID PAGO",
                "ID CONTRATO",
                "MONTO",
                "FECHA PAGO"};
            defaultTableModel.setColumnIdentifiers(cabecera);
            while (resultado.next()) {
                Object[] row = new Object[4];
                pagos.setIdPagos(resultado.getString("IdPagos"));
                pagos.setIdContrato(resultado.getString("IdContrato"));
                pagos.setMonto(resultado.getString("Monto"));
                pagos.setFecha_pago(resultado.getString("Fecha_pago"));

                row[0] = pagos.getIdPagos();
                row[1] = pagos.getIdContrato();
                row[2] = pagos.getMonto();
                row[3] = pagos.getFecha_pago();

                listaPagos.add(pagos);
                defaultTableModel.addRow(row);
            }
            tbPagos.setModel(defaultTableModel);
            resultado.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodo para cargar la tabla paquetes que se encuentra en la base de datos
    public void CargarPaquetes(JTable tbPaquetes, Paquete paquete, ArrayList<Paquete> listaPaquetes) {
        try {
            Connection connection = getConexion();
            Statement stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM `paquetes_internet`");
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            listaPaquetes.clear();
            String cabecera[] = {
                "ID PAQUET",
                "NOMBRE",
                "VELOCIDAD",
                "PRECIO MENSUAL"
            };
            defaultTableModel.setColumnIdentifiers(cabecera);
            while (resultado.next()) {
                Object[] row = new Object[4];
                paquete.setIdPaquete(resultado.getString("IdPaquete"));
                paquete.setNombre(resultado.getString("Nombre"));
                paquete.setVelocidad(resultado.getString("Velocidad"));
                paquete.setPrecio_mensual(resultado.getString("Precio_mensual"));

                row[0] = paquete.getIdPaquete();
                row[1] = paquete.getNombre();
                row[2] = paquete.getVelocidad();
                row[3] = paquete.getPrecio_mensual();

                listaPaquetes.add(paquete);
                defaultTableModel.addRow(row);
            }
            tbPaquetes.setModel(defaultTableModel);
            resultado.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //------------------------------FIN DE LOS METODOS PARA CARGAR TABLAS

//Metodos para registrar en cada una de las tablas de la BD moninet------------INICIO
    //Metodo para registrar un cliente en la DB moninet
    public void registrarCliente(Cliente cliente) {
        String sql;
        Connection conexion = getConexion();
        sql = "INSERT INTO `cliente`(`IdCliete`, `Nombre`, `Cedula`, `Direccion`, `Telefono`, `Correo`)"
                + "VALUES(?,?,?,?,?,?);";
        try {
            PreparedStatement ps = null;
            ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getIdCliente());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getCedula());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getTelefono());
            ps.setString(6, cliente.getCorreo());
            ps.execute();
            if (!conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    //Metodo para registrar un cliente en la DB moninet
    public void registrarContrato(Contratos contrato) {
        String sql;
        Connection conexion = getConexion();
        sql = "INSERT INTO `contrato`(`IdContrato`, `IdPaquete`, `Fecha_inicio`,"
                + " `Fecha_finalizacion`, `Estadoo`, `IdCliete`)"
                + "VALUES(?,?,?,?,?,?);";
        try {
            PreparedStatement ps = null;
            ps = conexion.prepareStatement(sql);
            ps.setString(1, contrato.getIdContrato());
            ps.setString(2, contrato.getPaquete());
            ps.setString(3, contrato.getFecha_inicio());
            ps.setString(4, contrato.getFecha_finalizacion());
            ps.setString(5, contrato.getEstado());
            ps.setString(5, contrato.getIdCliete());
            ps.execute();
            if (!conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //Metodo para registrar un pagos en la DB moninet
    public void registrarPagos(Pagos pagos) {
        String sql;
        Connection conexion = getConexion();
        sql = "INSERT INTO `pagos`(`IdPagos`, `IdContrato`, `Monto`, `Fecha_pago`) "
                + "VALUES(?,?,?,?);";

        try {
            PreparedStatement ps = null;
            ps = conexion.prepareStatement(sql);
            ps.setString(1, pagos.getIdPagos());
            ps.setString(2, pagos.getIdContrato());
            ps.setString(3, pagos.getMonto());
            ps.setString(4, pagos.getFecha_pago());

            ps.execute();
            if (!conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //Metodo para soporte un cliente en la DB moninet
    public void registrarSoporte(Soporte soporte) {
        String sql;
        Connection conexion = getConexion();
        sql = "INSERT INTO `soporte_tecnico`(`IdTicket`, `IdContrato`) "
                + "VALUES(?,?);";
        try {
            PreparedStatement ps = null;
            ps = conexion.prepareStatement(sql);
            ps.setString(1, soporte.getIdContrato());
            ps.setString(2, soporte.getIdTicket());

            ps.execute();
            if (!conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
//------------------------------FIN DE LOS METODOS PARA INSERTAR TABLAS

//Meetodos para actualizar las tablas de BD
    public void actualizarCliente(JTable tbClientes, Cliente cliente, ArrayList<Cliente> listaClientes) {
        try {
            PreparedStatement ps = null;
            Connection con = getConexion();
            String sql = "UPDATE `cliente` SET `Nombre`='" + cliente.getNombre()
                    + "',`Cedula`='" + cliente.getCedula() + "',`Direccion`='" + cliente.getDireccion()
                    + "',`Telefono`='" + cliente.getTelefono() + "',`Correo`='" + cliente.getCorreo()
                    + "' WHERE `IdCliete`=" + cliente.getIdCliente();
            ps = con.prepareStatement(sql);
            ps.execute();
            CargarClientes(tbClientes, cliente, listaClientes);
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarcontrato(JTable tbContratos, Contratos contratos, ArrayList<Contratos> listaContratos) {

        try {
            PreparedStatement ps = null;
            Connection con = getConexion();
            String sql = "UPDATE `contrato` SET"
                    + " `IdPaquete`='" + contratos.getPaquete()
                    + "',`Fecha_inicio`='" + contratos.getFecha_inicio()
                    + "',`Fecha_finalizacion`='" + contratos.getFecha_finalizacion()
                    + "',`Estadoo`='" + contratos.getEstado() + "',`IdCliete`='" + contratos.getIdCliete()
                    + "' WHERE `IdContrato` = " + contratos.getIdContrato();
            ps = con.prepareStatement(sql);
            ps.execute();
            CargarContratos(tbContratos, contratos, listaContratos);
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarPagos(JTable tbPagos, Pagos pagos, ArrayList<Pagos> listaPagos) {

        try {
            PreparedStatement ps = null;
            Connection con = getConexion();
            String sql = "UPDATE `pagos` SET `IdContrato`='" + pagos.getIdContrato()
                    + "',`Monto`='" + pagos.getMonto()
                    + "',`Fecha_pago`='" + pagos.getFecha_pago() + "' WHERE `IdPagos` =" + pagos.getIdPagos();
            ps = con.prepareStatement(sql);
            ps.execute();
            CargarPago(tbPagos, pagos, listaPagos);
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarPaquetes(JTable tbPaquetes, Paquete paquete, ArrayList<Paquete> listaPaquetes) {

        try {
            PreparedStatement ps = null;
            Connection con = getConexion();
            String sql = "UPDATE `paquetes_internet` SET "
                    + "`Nombre`='"+paquete.getNombre()
                    +"',`Velocidad`='"+paquete.getVelocidad()
                    +"',`Precio_mensual`='"+paquete.getPrecio_mensual()+"' WHERE `IdPaquete`="+paquete.getIdPaquete();
            ps = con.prepareStatement(sql);
            ps.execute();
            CargarPaquetes(tbPaquetes, paquete, listaPaquetes);
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//Metodos para eliminar de la base de datos
    public void eliminarCliente(Cliente cliente) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM `cliente` WHERE  `IdCliete` =" + cliente.getIdCliente();
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e) {

        }

    }

    public void eliminarContrato(Contratos contratos) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM `contrato` WHERE  `IdContrato` =" + contratos.getIdContrato();
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e) {

        }

    }

    public void eliminarPago(Pagos pagos) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM `pagos` WHERE  `IdPagos` =" + pagos.getIdPagos();
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e) {

        }

    }

    public void eliminarPaquete(Paquete paquete) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM `paquetes_internet` WHERE  `IdPaquete` =" + paquete.getIdPaquete();
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e) {

        }

    }

}
