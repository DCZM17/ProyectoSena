<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>AcarreosGutierrez</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="views/assets/img/favicon.png" rel="icon">
  <link href="views/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="views/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="views/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="views/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="views/assets/vendor/quill/quill.snow.css" rel="stylesheet">
  <link href="views/assets/vendor/quill/quill.bubble.css" rel="stylesheet">
  <link href="views/assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="views/assets/vendor/simple-datatables/style.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="views/assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: NiceAdmin - v2.3.1
  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="header fixed-top d-flex align-items-center">

    <div class="d-flex align-items-center justify-content-between">
      <a href="../menu.html" class="logo d-flex align-items-center">
        <img src="views/assets/img/camion.gif" alt="">
        <span class="d-none d-lg-block">AcarreosGutierrez</span>
      </a>
      <i class="bi bi-list toggle-sidebar-btn"></i>
    </div><!-- End Logo -->

    <nav class="header-nav ms-auto">
      <ul class="d-flex align-items-center">

        <li class="nav-item d-block d-lg-none">
          <a class="nav-link nav-icon search-bar-toggle " href="#">
            <i class="bi bi-search"></i>
          </a>
        </li><!-- End Search Icon-->



        <li class="nav-item dropdown pe-3">

          <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
            <img src="views/assets/img/user.png" alt="Profile" class="rounded-circle">
            <span class="d-none d-md-block dropdown-toggle ps-2">Paula López</span>
          </a><!-- End Profile Iamge Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
            <li class="dropdown-header">
              <h6>Paula López</h6>
              <span>Web Designer</span>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="<%=request.getContextPath()%>/logout">
                <i class="bi bi-box-arrow-right"></i>
                <span>Cerrar Sesion</span>
              </a>
            </li>
          </ul><!-- End Profile Dropdown Items -->
        </li><!-- End Profile Nav -->
      </ul>
    </nav><!-- End Icons Navigation -->
  </header><!-- End Header -->

   <!-- ======= Sidebar ======= -->
   <aside id="sidebar" class="sidebar">

    <ul class="sidebar-nav" id="sidebar-nav">

      <li class="nav-item">
        <a class="nav-link " href="views/index.html">
          <i class="bi bi-house"></i>
          <span>Inicio</span>
        </a>
      </li><!-- End Dashboard Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#empleado-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-people"></i><span>Empleados</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="empleado-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="empleado?action=listarS">
              <i class="bi bi-circle"></i><span>Gestionar</span>
            </a>
          </li>
        </ul>
      </li><!-- End Empleados Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#horariosR-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-calendar"></i><span>Horarios Registrados</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="horariosR-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="horarioRegistrado?accion=gestionarS">
              <i class="bi bi-circle"></i><span>Gestionar</span>
            </a>
          </li>
        </ul>
      </li><!-- End Horarios Registrados Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#horariosA-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-calendar-check"></i><span>Horarios Asignados</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="horariosA-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="horarioAsig?action=abrirAsigHorarioS">
              <i class="bi bi-circle"></i><span>Crear</span>
            </a>
          </li>
          <li>
            <a href="horarioAsig?action=listarS">
              <i class="bi bi-circle"></i><span>Gestionar</span>
            </a>
          </li>
        </ul>
      </li><!-- End Horarios Asignados Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#soportes-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-file-earmark"></i><span>Soportes</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="soportes-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="soporte?action=registrarS">
              <i class="bi bi-circle"></i><span>Crear</span>
            </a>
          </li>
          <li>
            <a href="soporte?action=listarS">
              <i class="bi bi-circle"></i><span>Gestionar</span>
            </a>
          </li>
        </ul>
      </li><!-- End Soportes Nav -->

      
    </ul>

  </aside><!-- End Sidebar-->
  <main id="main" class="main">
    <div>
    <section class="section dashboard">
        <div class="card">
            <div class="card-header">
                <h3>Crear Horario</h3>
            </div>
            <div class="card-body">
                <form action="horarioAsig" method="post">
                    <br>
                    <div class="row">
                        <div class="col-sm-4">
                            <label class="label">Hora de Entrada: <span class="text-danger">*</span></label>
                            <input type="time" value="00:00" min="07:00" max="09:00" name="horaEntradaAsignada" id="horaEntradaAsignada" class="form-control" required>
                        </div>
                        <div class="col-sm-4">
                            <label class="label">Hora de Salida: <span class="text-danger">*</span></label>
                            <input type="time" value="00:00" min="16:00" max="18:00" name="horaSalidaAsignada" id="horaSalidaAsignada" class="form-control" required>
                        </div>
                        <div class="col-sm-4">
                            <label class="label">Estado: <span class="text-danger">*</span></label>
                            <select name="estadoHorario" id="estadoHorario" class="form-control" required>
                                <option value="">Seleccione..</option>
                                <option value="activo">Activo</option>
                                <option value="inactivo">Inactivo</option>
                            </select>
                        </div>
                    </div>
                    <br>
                    <div class="card-footer" style="text-align: center;">
                        <button type="submit" name="action" value="addS" class="btn btn-primary">Crear Horario</button>
                      </div>
                </form>
            </div>
        </div>
    </section>
    </div>
  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer" class="footer">
    <div class="copyright">
      &copy; Copyright <strong><span>AcarreosGutierrez</span></strong>. Reservados todos los derechos
    </div>

  </footer><!-- End Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="views/assets/vendor/apexcharts/apexcharts.min.js"></script>
  <script src="views/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="views/assets/vendor/chart.js/chart.min.js"></script>
  <script src="views/assets/vendor/echarts/echarts.min.js"></script>
  <script src="views/assets/vendor/quill/quill.min.js"></script>
  <script src="views/assets/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="views/assets/vendor/tinymce/tinymce.min.js"></script>
  <script src="views/assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="views/assets/js/main.js"></script>

</body>

</html>