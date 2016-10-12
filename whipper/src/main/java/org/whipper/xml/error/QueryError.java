//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.10 at 10:18:31 AM CEST 
//


package org.whipper.xml.error;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.whipper.xml.result.QueryResultType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="failures">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="failure" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="actual-result" type="{}queryResultType"/>
 *         &lt;element name="expected-result" type="{}queryResultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "query",
    "failures",
    "actualResult",
    "expectedResult"
})
@XmlRootElement(name = "query-error")
public class QueryError {

    @XmlElement(required = true)
    protected String query;
    @XmlElement(required = true)
    protected QueryError.Failures failures;
    @XmlElement(name = "actual-result", required = true)
    protected QueryResultType actualResult;
    @XmlElement(name = "expected-result", required = true)
    protected QueryResultType expectedResult;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the failures property.
     * 
     * @return
     *     possible object is
     *     {@link QueryError.Failures }
     *     
     */
    public QueryError.Failures getFailures() {
        return failures;
    }

    /**
     * Sets the value of the failures property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryError.Failures }
     *     
     */
    public void setFailures(QueryError.Failures value) {
        this.failures = value;
    }

    /**
     * Gets the value of the actualResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getActualResult() {
        return actualResult;
    }

    /**
     * Sets the value of the actualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setActualResult(QueryResultType value) {
        this.actualResult = value;
    }

    /**
     * Gets the value of the expectedResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getExpectedResult() {
        return expectedResult;
    }

    /**
     * Sets the value of the expectedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setExpectedResult(QueryResultType value) {
        this.expectedResult = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="failure" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "failure"
    })
    public static class Failures {

        @XmlElement(required = true)
        protected List<String> failure;

        /**
         * Gets the value of the failure property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the failure property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFailure().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFailure() {
            if (failure == null) {
                failure = new ArrayList<>();
            }
            return this.failure;
        }

    }

}