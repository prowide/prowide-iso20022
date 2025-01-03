
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Query based on various identification of the security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentificationQuery4Choice", propOrder = {
    "isin",
    "altrntvInstrmId",
    "notAvlbl",
    "unqPdctIdr",
    "indx",
    "bskt",
    "notRptd"
})
public class SecurityIdentificationQuery4Choice {

    @XmlElement(name = "ISIN")
    protected List<String> isin;
    @XmlElement(name = "AltrntvInstrmId")
    protected List<String> altrntvInstrmId;
    @XmlElement(name = "NotAvlbl")
    @XmlSchemaType(name = "string")
    protected NotAvailable1Code notAvlbl;
    @XmlElement(name = "UnqPdctIdr")
    protected List<String> unqPdctIdr;
    @XmlElement(name = "Indx")
    protected List<SecurityIdentification20Choice> indx;
    @XmlElement(name = "Bskt")
    protected List<BasketQuery1> bskt;
    @XmlElement(name = "NotRptd")
    @XmlSchemaType(name = "string")
    protected NotReported1Code notRptd;

    /**
     * Gets the value of the isin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the isin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the isin property.
     */
    public List<String> getISIN() {
        if (isin == null) {
            isin = new ArrayList<>();
        }
        return this.isin;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrntvInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrntvInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the altrntvInstrmId property.
     */
    public List<String> getAltrntvInstrmId() {
        if (altrntvInstrmId == null) {
            altrntvInstrmId = new ArrayList<>();
        }
        return this.altrntvInstrmId;
    }

    /**
     * Gets the value of the notAvlbl property.
     * 
     * @return
     *     possible object is
     *     {@link NotAvailable1Code }
     *     
     */
    public NotAvailable1Code getNotAvlbl() {
        return notAvlbl;
    }

    /**
     * Sets the value of the notAvlbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotAvailable1Code }
     *     
     */
    public SecurityIdentificationQuery4Choice setNotAvlbl(NotAvailable1Code value) {
        this.notAvlbl = value;
        return this;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unqPdctIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnqPdctIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the unqPdctIdr property.
     */
    public List<String> getUnqPdctIdr() {
        if (unqPdctIdr == null) {
            unqPdctIdr = new ArrayList<>();
        }
        return this.unqPdctIdr;
    }

    /**
     * Gets the value of the indx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification20Choice }
     * 
     * 
     * @return
     *     The value of the indx property.
     */
    public List<SecurityIdentification20Choice> getIndx() {
        if (indx == null) {
            indx = new ArrayList<>();
        }
        return this.indx;
    }

    /**
     * Gets the value of the bskt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bskt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBskt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketQuery1 }
     * 
     * 
     * @return
     *     The value of the bskt property.
     */
    public List<BasketQuery1> getBskt() {
        if (bskt == null) {
            bskt = new ArrayList<>();
        }
        return this.bskt;
    }

    /**
     * Gets the value of the notRptd property.
     * 
     * @return
     *     possible object is
     *     {@link NotReported1Code }
     *     
     */
    public NotReported1Code getNotRptd() {
        return notRptd;
    }

    /**
     * Sets the value of the notRptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotReported1Code }
     *     
     */
    public SecurityIdentificationQuery4Choice setNotRptd(NotReported1Code value) {
        this.notRptd = value;
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
     * Adds a new item to the iSIN list.
     * @see #getISIN()
     * 
     */
    public SecurityIdentificationQuery4Choice addISIN(String iSIN) {
        getISIN().add(iSIN);
        return this;
    }

    /**
     * Adds a new item to the altrntvInstrmId list.
     * @see #getAltrntvInstrmId()
     * 
     */
    public SecurityIdentificationQuery4Choice addAltrntvInstrmId(String altrntvInstrmId) {
        getAltrntvInstrmId().add(altrntvInstrmId);
        return this;
    }

    /**
     * Adds a new item to the unqPdctIdr list.
     * @see #getUnqPdctIdr()
     * 
     */
    public SecurityIdentificationQuery4Choice addUnqPdctIdr(String unqPdctIdr) {
        getUnqPdctIdr().add(unqPdctIdr);
        return this;
    }

    /**
     * Adds a new item to the indx list.
     * @see #getIndx()
     * 
     */
    public SecurityIdentificationQuery4Choice addIndx(SecurityIdentification20Choice indx) {
        getIndx().add(indx);
        return this;
    }

    /**
     * Adds a new item to the bskt list.
     * @see #getBskt()
     * 
     */
    public SecurityIdentificationQuery4Choice addBskt(BasketQuery1 bskt) {
        getBskt().add(bskt);
        return this;
    }

}
