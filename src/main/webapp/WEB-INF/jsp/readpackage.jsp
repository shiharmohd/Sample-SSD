<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
                <html>

                <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
                    <title>Tour</title>
                </head>

                <body>
<div class="container">
    <div class="header">
        <div class="header-logo">
            <svg class="site-logo" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512">
                <path d="M512 256a15 15 0 00-7.1-12.8l-52-32 52-32.5a15 15 0 000-25.4L264 2.3c-4.8-3-11-3-15.9 0L7 153.3a15 15 0 000 25.4L58.9 211 7.1 243.3a15 15 0 000 25.4L58.8 301 7.1 333.3a15 15 0 000 25.4l241 151a15 15 0 0015.9 0l241-151a15 15 0 00-.1-25.5l-52-32 52-32.5A15 15 0 00512 256zM43.3 166L256 32.7 468.7 166 256 298.3 43.3 166zM468.6 346L256 479.3 43.3 346l43.9-27.4L248 418.7a15 15 0 0015.8 0L424.4 319l44.2 27.2zM256 388.3L43.3 256l43.9-27.4L248 328.7a15 15 0 0015.8 0L424.4 229l44.1 27.2L256 388.3z"/>
            </svg>
            <span class="site-title">Tours</span>
        </div>
        <div class="header-search">
            <button class="button-menu">
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 385 385">
                    <path d="M12 120.3h361a12 12 0 000-24H12a12 12 0 000 24zM373 180.5H12a12 12 0 000 24h361a12 12 0 000-24zM373 264.7H132.2a12 12 0 000 24H373a12 12 0 000-24z"/>
                </svg>
            </button>
            <input type="search" placeholder="Search Documentation..."/>
        </div>
    </div>
    <div class="main">
        <div class="sidebar">
            <ul>
                <li><a href="index.html" ><i class="lni lni-home"></i><span>Dashboard</span></a></li>
                <li><a class="active" href="/read-package"><i class="lni lni-text-format"></i><span>Packages</span></a></li>
                <li><a href="/read-activity"><i class="lni lni-bar-chart"></i><span>Activity's</span></a></li>
                <li><a href="/read-customer"><i class="lni lni-grid"></i><span>Customers</span></a></li>
                <li><a  href="/read-booking"><i class="lni lni-bullhorn"></i><span>Bookings</span></a></li>
                <li><a href="/read-feedback"><i class="lni lni-support"></i><span>Feedbacks</span></a></li>
            </ul>
        </div>
        <div class="page-content">
            <h1>Package Information</h1>
                        <br />
                        <table border="1" cellpadding="10">
                            <tr>
                                <th>Name</th>
                                <th>Description</th>
                                <th>Price</th>
                                <th>Start Date</th>
                                <th>End Date</th>
                                <th>Start Location</th>
                                <th>End Location</th>
                                <th>No of Nights</th>
                                <th>No of Days</th>
                                <th>Notes</th>
                            </tr>
                            <c:forEach var="package" items="${packages}">
                            <tr>
                                <td>${package.name}</td>
                                <td>${package.description}</td>
                                <td>${package.price}</td>
                                <td>${package.start_date}</td>
                                <td>${package.end_date}</td>
                                <td>${package.start_location}</td>
                                <td>${package.end_location}</td>
                                <td>${package.number_of_nights}</td>
                                <td>${package.number_of_days}</td>
                                <td>${package.notes}</td>
                                <td><a href="/update-package/${package.id}">Update</a></td>
                                <td><a href="/delete-package/${package.id}">Delete</a></td>
                            </tr>
                            </c:forEach>
                        </table>
                        <br/>
                        <a href="/create-package">Create Package</a>
        </div>
    </div>
</div>
        </body>
        </html>
<style type="text/css">
  * {
    margin: 0;
    padding: 0;
  }
  body {
    font-family: "Hind Vadodara", -apple-system, BlinkMacSystemFont, Segoe UI,
      Helvetica Neue, Arial, sans-serif;
  }
  .container {
    display: flex;
    height: 100vh;
    width: 100vw;
    flex-wrap: wrap;
    overflow: hidden;
  }
  .main {
    height: calc(100% - 50px);
    display: flex;
    flex: 1;
  }
  .sidebar {
    height: 100%;
    width: 220px;
    box-sizing: border-box;
    box-shadow: 0 0 2rem 0 rgb(0 0 0 / 5%);
    overflow: hidden;
    transition: width 0.5s ease;
  }
  .container.nav-closed .sidebar,
  .container.nav-closed .header-logo {
    width: 0;
  }
  .sidebar ul {
    display: flex;
    flex-direction: column;
    padding: 5px;
  }
  .sidebar ul li {
    display: flex;
    align-items: center;
  }
  .sidebar ul li a {
    color: #000;
    text-decoration: none;
    display: flex;
    align-items: center;
    width: 100%;
    padding: 10px;
    white-space: nowrap;
  }
  .sidebar ul li a.active,
  .sidebar ul li a:hover {
    background: #e8ecef;
  }
  .sidebar ul li span {
    margin-left: 16px;
    font-size: 16px;
    font-weight: 100;
  }
  .sidebar ul li i {
    font-size: 18px;
    color: #111;
    font-weight: normal;
  }
  .header {
    height: 50px;
    background: #303f9f;
    width: 100%;
    display: flex;
    align-items: center;
    flex-basis: 100%;
  }
  .sidebar ul li a.active i {
    color: #303f9e;
  }
  .site-logo {
    height: 32px;
    width: 32px;
    min-height: 32px;
    min-width: 32px;
    margin: 0 18px 0 15px;
  }
  .site-logo path {
    fill: #fff;
  }
  .site-title {
    color: #fff;
    font-size: 24px;
    letter-spacing: 1px;
    font-weight: 400;
  }
  .page-content {
    padding: 10px 20px;
    box-sizing: border-box;
    width: 100%;
    flex: 1;
  }
  .page-content h1 {
    font-size: 20px;
    font-weight: 400;
    color: #333;
  }
  .header-search {
    height: 100%;
    align-items: center;
    display: flex;
    padding: 0 20px;
    flex: 1;
  }
  .header-search .button-menu {
    width: 28px;
    height: 28px;
    margin-right: 15px;
    background: none;
    border: 0;
    cursor: pointer;
  }
  .header-logo {
    display: flex;
    align-items: center;
    width: 220px;
    overflow: hidden;
    transition: width 0.5s ease;
  }
  .header-search input[type="search"] {
    height: 100%;
    width: 300px;
    padding: 10px 20px;
    box-sizing: border-box;
    font-size: 14px;
    font-weight: 100;
    background: none;
    border: none;
    color: #fff;
  }
  .header-search input[type="search"]:focus {
    outline: none;
  }
  .header-search input[type="search"]::placeholder {
    color: #ccc;
  }
  .header-search .button-menu:focus {
    outline: none;
    border: none;
  }
  .header-search .button-menu svg path {
    fill: #fff;
  }
  @media screen and (max-width: 991px) {
    .page-content {
      width: 100vw;
    }
  }
  @media screen and (max-width: 767px) {
    .header-logo {
      display: none;
    }
  }


</style>

<script type="text/javascript">
  let menuButton = document.querySelector(".button-menu");
  let container = document.querySelector(".container");
  let pageContent = document.querySelector(".page-content");
  let responsiveBreakpoint = 991;

  if (window.innerWidth <= responsiveBreakpoint) {
    container.classList.add("nav-closed");
  }

  menuButton.addEventListener("click", function () {
    container.classList.toggle("nav-closed");
  });

  pageContent.addEventListener("click", function () {
    if (window.innerWidth <= responsiveBreakpoint) {
      container.classList.add("nav-closed");
    }
  });


  window.addEventListener("resize", function () {
    if (window.innerWidth > responsiveBreakpoint) {
      container.classList.remove("nav-closed");
    }
  });


</script>