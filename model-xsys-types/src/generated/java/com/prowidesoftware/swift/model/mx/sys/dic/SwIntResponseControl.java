
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ResponseControl complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseControl", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "responseCrypto",
    "nrIndicator",
    "productList",
    "returnSignatureList"
})
public class SwIntResponseControl {

    @XmlElement(name = "ResponseCrypto")
    protected String responseCrypto;
    @XmlElement(name = "NRIndicator")
    protected String nrIndicator;
    @XmlElement(name = "ProductList", namespace = "urn:swift:snl:ns.Sw")
    protected SwProductList productList;
    @XmlElement(name = "ReturnSignatureList", namespace = "urn:swift:snl:ns.Sw")
    protected String returnSignatureList;

    /**
     * Gets the value of the responseCrypto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCrypto() {
        return responseCrypto;
    }

    /**
     * Sets the value of the responseCrypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntResponseControl setResponseCrypto(String value) {
        this.responseCrypto = value;
        return this;
    }

    /**
     * Gets the value of the nrIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRIndicator() {
        return nrIndicator;
    }

    /**
     * Sets the value of the nrIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntResponseControl setNRIndicator(String value) {
        this.nrIndicator = value;
        return this;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link SwProductList }
     *     
     */
    public SwProductList getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwProductList }
     *     
     */
    public SwIntResponseControl setProductList(SwProductList value) {
        this.productList = value;
        return this;
    }

    /**
     * Gets the value of the returnSignatureList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnSignatureList() {
        return returnSignatureList;
    }

    /**
     * Sets the value of the returnSignatureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntResponseControl setReturnSignatureList(String value) {
        this.returnSignatureList = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
