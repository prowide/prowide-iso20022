
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
 * Java class for FileResponseControl complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileResponseControl", propOrder = {
    "responseCrypto",
    "nrIndicator",
    "eventEP",
    "transferEP",
    "partition",
    "transferKey",
    "localRef",
    "productList",
    "returnSignatureList",
    "rmaChecked",
    "transferEPVerifier"
})
public class SwFileResponseControl {

    @XmlElement(name = "ResponseCrypto", namespace = "urn:swift:snl:ns.SwInt")
    protected String responseCrypto;
    @XmlElement(name = "NRIndicator", namespace = "urn:swift:snl:ns.SwInt")
    protected String nrIndicator;
    @XmlElement(name = "EventEP")
    protected String eventEP;
    @XmlElement(name = "TransferEP")
    protected String transferEP;
    @XmlElement(name = "Partition")
    protected String partition;
    @XmlElement(name = "TransferKey")
    protected String transferKey;
    @XmlElement(name = "LocalRef")
    protected String localRef;
    @XmlElement(name = "ProductList")
    protected SwProductList productList;
    @XmlElement(name = "ReturnSignatureList")
    protected String returnSignatureList;
    @XmlElement(name = "RMAChecked")
    protected String rmaChecked;
    @XmlElement(name = "TransferEPVerifier")
    protected String transferEPVerifier;

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
    public SwFileResponseControl setResponseCrypto(String value) {
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
    public SwFileResponseControl setNRIndicator(String value) {
        this.nrIndicator = value;
        return this;
    }

    /**
     * Gets the value of the eventEP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventEP() {
        return eventEP;
    }

    /**
     * Sets the value of the eventEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileResponseControl setEventEP(String value) {
        this.eventEP = value;
        return this;
    }

    /**
     * Gets the value of the transferEP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferEP() {
        return transferEP;
    }

    /**
     * Sets the value of the transferEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileResponseControl setTransferEP(String value) {
        this.transferEP = value;
        return this;
    }

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileResponseControl setPartition(String value) {
        this.partition = value;
        return this;
    }

    /**
     * Gets the value of the transferKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferKey() {
        return transferKey;
    }

    /**
     * Sets the value of the transferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileResponseControl setTransferKey(String value) {
        this.transferKey = value;
        return this;
    }

    /**
     * Gets the value of the localRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRef() {
        return localRef;
    }

    /**
     * Sets the value of the localRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileResponseControl setLocalRef(String value) {
        this.localRef = value;
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
    public SwFileResponseControl setProductList(SwProductList value) {
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
    public SwFileResponseControl setReturnSignatureList(String value) {
        this.returnSignatureList = value;
        return this;
    }

    /**
     * Gets the value of the rmaChecked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMAChecked() {
        return rmaChecked;
    }

    /**
     * Sets the value of the rmaChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileResponseControl setRMAChecked(String value) {
        this.rmaChecked = value;
        return this;
    }

    /**
     * Gets the value of the transferEPVerifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferEPVerifier() {
        return transferEPVerifier;
    }

    /**
     * Sets the value of the transferEPVerifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileResponseControl setTransferEPVerifier(String value) {
        this.transferEPVerifier = value;
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
