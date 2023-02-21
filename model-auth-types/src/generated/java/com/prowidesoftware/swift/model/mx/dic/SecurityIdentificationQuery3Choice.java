
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
@XmlType(name = "SecurityIdentificationQuery3Choice", propOrder = {
    "isin",
    "altrntvInstrmId",
    "notAvlbl",
    "unqPdctIdr",
    "indx",
    "notRptd"
})
public class SecurityIdentificationQuery3Choice {

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
    @XmlElement(name = "NotRptd")
    @XmlSchemaType(name = "string")
    protected NotReported1Code notRptd;

    /**
     * Gets the value of the isin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isin property.
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
     */
    public List<String> getISIN() {
        if (isin == null) {
            isin = new ArrayList<String>();
        }
        return this.isin;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altrntvInstrmId property.
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
     */
    public List<String> getAltrntvInstrmId() {
        if (altrntvInstrmId == null) {
            altrntvInstrmId = new ArrayList<String>();
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
    public SecurityIdentificationQuery3Choice setNotAvlbl(NotAvailable1Code value) {
        this.notAvlbl = value;
        return this;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unqPdctIdr property.
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
     */
    public List<String> getUnqPdctIdr() {
        if (unqPdctIdr == null) {
            unqPdctIdr = new ArrayList<String>();
        }
        return this.unqPdctIdr;
    }

    /**
     * Gets the value of the indx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indx property.
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
     */
    public List<SecurityIdentification20Choice> getIndx() {
        if (indx == null) {
            indx = new ArrayList<SecurityIdentification20Choice>();
        }
        return this.indx;
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
    public SecurityIdentificationQuery3Choice setNotRptd(NotReported1Code value) {
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
    public SecurityIdentificationQuery3Choice addISIN(String iSIN) {
        getISIN().add(iSIN);
        return this;
    }

    /**
     * Adds a new item to the altrntvInstrmId list.
     * @see #getAltrntvInstrmId()
     * 
     */
    public SecurityIdentificationQuery3Choice addAltrntvInstrmId(String altrntvInstrmId) {
        getAltrntvInstrmId().add(altrntvInstrmId);
        return this;
    }

    /**
     * Adds a new item to the unqPdctIdr list.
     * @see #getUnqPdctIdr()
     * 
     */
    public SecurityIdentificationQuery3Choice addUnqPdctIdr(String unqPdctIdr) {
        getUnqPdctIdr().add(unqPdctIdr);
        return this;
    }

    /**
     * Adds a new item to the indx list.
     * @see #getIndx()
     * 
     */
    public SecurityIdentificationQuery3Choice addIndx(SecurityIdentification20Choice indx) {
        getIndx().add(indx);
        return this;
    }

}
