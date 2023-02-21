
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
 * Choice between ISIN and an alternative format for the identification of a financial instrument. ISIN is the preferred format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification34Choice", propOrder = {
    "isin",
    "altrntvInstrmId",
    "unqPdctIdr",
    "bsktCnsttnts",
    "indx",
    "idNotAvlbl"
})
public class SecurityIdentification34Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "AltrntvInstrmId")
    protected String altrntvInstrmId;
    @XmlElement(name = "UnqPdctIdr")
    protected String unqPdctIdr;
    @XmlElement(name = "BsktCnsttnts")
    protected List<SecurityIdentification18Choice> bsktCnsttnts;
    @XmlElement(name = "Indx")
    protected SecurityIdentification35Choice indx;
    @XmlElement(name = "IdNotAvlbl")
    @XmlSchemaType(name = "string")
    protected UnderlyingIdentification1Code idNotAvlbl;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification34Choice setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrntvInstrmId() {
        return altrntvInstrmId;
    }

    /**
     * Sets the value of the altrntvInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification34Choice setAltrntvInstrmId(String value) {
        this.altrntvInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqPdctIdr() {
        return unqPdctIdr;
    }

    /**
     * Sets the value of the unqPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification34Choice setUnqPdctIdr(String value) {
        this.unqPdctIdr = value;
        return this;
    }

    /**
     * Gets the value of the bsktCnsttnts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bsktCnsttnts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBsktCnsttnts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification18Choice }
     * 
     * 
     */
    public List<SecurityIdentification18Choice> getBsktCnsttnts() {
        if (bsktCnsttnts == null) {
            bsktCnsttnts = new ArrayList<SecurityIdentification18Choice>();
        }
        return this.bsktCnsttnts;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification35Choice }
     *     
     */
    public SecurityIdentification35Choice getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification35Choice }
     *     
     */
    public SecurityIdentification34Choice setIndx(SecurityIdentification35Choice value) {
        this.indx = value;
        return this;
    }

    /**
     * Gets the value of the idNotAvlbl property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingIdentification1Code }
     *     
     */
    public UnderlyingIdentification1Code getIdNotAvlbl() {
        return idNotAvlbl;
    }

    /**
     * Sets the value of the idNotAvlbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingIdentification1Code }
     *     
     */
    public SecurityIdentification34Choice setIdNotAvlbl(UnderlyingIdentification1Code value) {
        this.idNotAvlbl = value;
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
     * Adds a new item to the bsktCnsttnts list.
     * @see #getBsktCnsttnts()
     * 
     */
    public SecurityIdentification34Choice addBsktCnsttnts(SecurityIdentification18Choice bsktCnsttnts) {
        getBsktCnsttnts().add(bsktCnsttnts);
        return this;
    }

}
