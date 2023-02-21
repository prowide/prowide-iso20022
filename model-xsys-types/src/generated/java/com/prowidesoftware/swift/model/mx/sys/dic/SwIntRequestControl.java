
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for RequestControl complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestControl", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "requestCrypto",
    "nrIndicator",
    "deliveryCtrl",
    "productList",
    "returnSignatureList",
    "copyIndicator",
    "authNotifInd",
    "recipientList",
    "publicRecipientListInd",
    "rmaChecked"
})
public class SwIntRequestControl {

    @XmlElement(name = "RequestCrypto")
    protected String requestCrypto;
    @XmlElement(name = "NRIndicator")
    protected String nrIndicator;
    @XmlElement(name = "DeliveryCtrl")
    protected SwIntDeliveryCtrl deliveryCtrl;
    @XmlElement(name = "ProductList", namespace = "urn:swift:snl:ns.Sw")
    protected List<SwProductList> productList;
    @XmlElement(name = "ReturnSignatureList", namespace = "urn:swift:snl:ns.Sw")
    protected String returnSignatureList;
    @XmlElement(name = "CopyIndicator", namespace = "urn:swift:snl:ns.Sw")
    protected String copyIndicator;
    @XmlElement(name = "AuthNotifInd", namespace = "urn:swift:snl:ns.Sw")
    protected String authNotifInd;
    @XmlElement(name = "RecipientList", namespace = "urn:swift:snl:ns.Sw")
    protected SwRecipientList recipientList;
    @XmlElement(name = "PublicRecipientListInd", namespace = "urn:swift:snl:ns.Sw")
    protected String publicRecipientListInd;
    @XmlElement(name = "RMAChecked", namespace = "urn:swift:snl:ns.Sw")
    protected String rmaChecked;

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
    public SwIntRequestControl setRequestCrypto(String value) {
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
    public SwIntRequestControl setNRIndicator(String value) {
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
    public SwIntRequestControl setDeliveryCtrl(SwIntDeliveryCtrl value) {
        this.deliveryCtrl = value;
        return this;
    }

    /**
     * Gets the value of the productList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwProductList }
     * 
     * 
     */
    public List<SwProductList> getProductList() {
        if (productList == null) {
            productList = new ArrayList<SwProductList>();
        }
        return this.productList;
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
    public SwIntRequestControl setReturnSignatureList(String value) {
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
    public SwIntRequestControl setCopyIndicator(String value) {
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
    public SwIntRequestControl setAuthNotifInd(String value) {
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
    public SwIntRequestControl setRecipientList(SwRecipientList value) {
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
    public SwIntRequestControl setPublicRecipientListInd(String value) {
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
    public SwIntRequestControl setRMAChecked(String value) {
        this.rmaChecked = value;
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

    /**
     * Adds a new item to the productList list.
     * @see #getProductList()
     * 
     */
    public SwIntRequestControl addProductList(SwProductList productList) {
        getProductList().add(productList);
        return this;
    }

}
