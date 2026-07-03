
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
 * Java class for FileRequestControl complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileRequestControl", propOrder = {
    "requestCrypto",
    "nrIndicator",
    "deliveryCtrl",
    "eventEP",
    "transferEP",
    "partition",
    "transferKey",
    "localRef",
    "productList",
    "returnSignatureList",
    "copyIndicator",
    "authNotifInd",
    "recipientList",
    "publicRecipientListInd",
    "rmaChecked",
    "transferEPVerifier"
})
public class SwFileRequestControl {

    @XmlElement(name = "RequestCrypto", namespace = "urn:swift:snl:ns.SwInt")
    protected String requestCrypto;
    @XmlElement(name = "NRIndicator", namespace = "urn:swift:snl:ns.SwInt")
    protected String nrIndicator;
    @XmlElement(name = "DeliveryCtrl", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntDeliveryCtrl deliveryCtrl;
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
    @XmlElement(name = "CopyIndicator")
    protected String copyIndicator;
    @XmlElement(name = "AuthNotifInd")
    protected String authNotifInd;
    @XmlElement(name = "RecipientList")
    protected SwRecipientList recipientList;
    @XmlElement(name = "PublicRecipientListInd")
    protected String publicRecipientListInd;
    @XmlElement(name = "RMAChecked")
    protected String rmaChecked;
    @XmlElement(name = "TransferEPVerifier")
    protected String transferEPVerifier;

    /**
     * Gets the value of the requestCrypto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCrypto() {
        return requestCrypto;
    }

    /**
     * Sets the value of the requestCrypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileRequestControl setRequestCrypto(String value) {
        this.requestCrypto = value;
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
    public SwFileRequestControl setNRIndicator(String value) {
        this.nrIndicator = value;
        return this;
    }

    /**
     * Gets the value of the deliveryCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntDeliveryCtrl }
     *     
     */
    public SwIntDeliveryCtrl getDeliveryCtrl() {
        return deliveryCtrl;
    }

    /**
     * Sets the value of the deliveryCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntDeliveryCtrl }
     *     
     */
    public SwFileRequestControl setDeliveryCtrl(SwIntDeliveryCtrl value) {
        this.deliveryCtrl = value;
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
    public SwFileRequestControl setEventEP(String value) {
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
    public SwFileRequestControl setTransferEP(String value) {
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
    public SwFileRequestControl setPartition(String value) {
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
    public SwFileRequestControl setTransferKey(String value) {
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
    public SwFileRequestControl setLocalRef(String value) {
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
    public SwFileRequestControl setProductList(SwProductList value) {
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
    public SwFileRequestControl setReturnSignatureList(String value) {
        this.returnSignatureList = value;
        return this;
    }

    /**
     * Gets the value of the copyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyIndicator() {
        return copyIndicator;
    }

    /**
     * Sets the value of the copyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileRequestControl setCopyIndicator(String value) {
        this.copyIndicator = value;
        return this;
    }

    /**
     * Gets the value of the authNotifInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthNotifInd() {
        return authNotifInd;
    }

    /**
     * Sets the value of the authNotifInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileRequestControl setAuthNotifInd(String value) {
        this.authNotifInd = value;
        return this;
    }

    /**
     * Gets the value of the recipientList property.
     * 
     * @return
     *     possible object is
     *     {@link SwRecipientList }
     *     
     */
    public SwRecipientList getRecipientList() {
        return recipientList;
    }

    /**
     * Sets the value of the recipientList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwRecipientList }
     *     
     */
    public SwFileRequestControl setRecipientList(SwRecipientList value) {
        this.recipientList = value;
        return this;
    }

    /**
     * Gets the value of the publicRecipientListInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicRecipientListInd() {
        return publicRecipientListInd;
    }

    /**
     * Sets the value of the publicRecipientListInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileRequestControl setPublicRecipientListInd(String value) {
        this.publicRecipientListInd = value;
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
    public SwFileRequestControl setRMAChecked(String value) {
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
    public SwFileRequestControl setTransferEPVerifier(String value) {
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
