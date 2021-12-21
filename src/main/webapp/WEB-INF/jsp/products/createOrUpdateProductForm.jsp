<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="parchisoca" tagdir="/WEB-INF/tags" %>

<parchisoca:layout pageName="products">
    <div class="col-md-6 p-3 m-3 border border-secondary w-100 rounded">
 <form:form method="POST" modelAttribute="user" class="form-signin">
             <h2 class="lead">Add Product</h2>
             <hr>
             <div class="row">
                <div class="col-3 text-end">
                    <h3 class="text-capitalize">Name :</h3>
                </div>
                <div class="col">
                    <spring:bind path="name">
                     <form:input type="text" path="name" class="form-control" ></form:input>
                    </spring:bind>
                </div>
            </div>

            <div class="row">
                <div class="col-3 text-end">
                    <h3 class="text-capitalize">Price :</h3>
                </div>
                <div class="col">
                    <spring:bind path="price">
                     <form:input type="text" path="price" class="form-control" ></form:input>
                    </spring:bind>
                </div>
            </div>


            <div class="row">
                <div class="col-3 text-end">
                    <h3 class="text-capitalize">Price :</h3>
                </div>
                <div class="col">
                    <spring:bind path="productType">
                        <form:select path="productType">
                            <form:options items="${typelist}" />
                        </form:select>                    
                    </spring:bind>
                </div>
            </div>

            <div class="row">
                <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
            </div>


            
         </form:form>
        </div>
</parchisoca:layout>
