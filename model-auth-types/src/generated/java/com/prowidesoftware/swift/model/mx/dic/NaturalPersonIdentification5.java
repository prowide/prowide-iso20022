
package com.prowidesoftware.swift.model.mx.dic;

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
 * Identifies a natural person through identification number, name and domicile.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaturalPersonIdentification5", propOrder = {
    "prsnNm",
    "npi",
    "altrnId",
    "nttySz",
    "sctr",
    "nttyTp"
})
public class NaturalPersonIdentification5 {

    @XmlElement(name = "PrsnNm")
    protected List<String> prsnNm;
    @XmlElement(name = "NPI")
    protected String npi;
    @XmlElement(name = "AltrnId")
    protected GenericIdentification175 altrnId;
    @XmlElement(name = "NttySz")
    protected String nttySz;
    @XmlElement(name = "Sctr")
    protected List<IndustrySector3Choice> sctr;
    @XmlElement(name = "NttyTp")
    protected String nttyTp;

    /**
     * Gets the value of the prsnNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prsnNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrsnNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the prsnNm property.
     */
    public List<String> getPrsnNm() {
        if (prsnNm == null) {
            prsnNm = new ArrayList<>();
        }
        return this.prsnNm;
    }

    /**
     * Gets the value of the npi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPI() {
        return npi;
    }

    /**
     * Sets the value of the npi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NaturalPersonIdentification5 setNPI(String value) {
        this.npi = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification175 }
     *     
     */
    public GenericIdentification175 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification175 }
     *     
     */
    public NaturalPersonIdentification5 setAltrnId(GenericIdentification175 value) {
        this.altrnId = value;
        return this;
    }

    /**
     * Gets the value of the nttySz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNttySz() {
        return nttySz;
    }

    /**
     * Sets the value of the nttySz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NaturalPersonIdentification5 setNttySz(String value) {
        this.nttySz = value;
        return this;
    }

    /**
     * Gets the value of the sctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustrySector3Choice }
     * 
     * 
     * @return
     *     The value of the sctr property.
     */
    public List<IndustrySector3Choice> getSctr() {
        if (sctr == null) {
            sctr = new ArrayList<>();
        }
        return this.sctr;
    }

    /**
     * Gets the value of the nttyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNttyTp() {
        return nttyTp;
    }

    /**
     * Sets the value of the nttyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NaturalPersonIdentification5 setNttyTp(String value) {
        this.nttyTp = value;
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
     * Adds a new item to the prsnNm list.
     * @see #getPrsnNm()
     * 
     */
    public NaturalPersonIdentification5 addPrsnNm(String prsnNm) {
        getPrsnNm().add(prsnNm);
        return this;
    }

    /**
     * Adds a new item to the sctr list.
     * @see #getSctr()
     * 
     */
    public NaturalPersonIdentification5 addSctr(IndustrySector3Choice sctr) {
        getSctr().add(sctr);
        return this;
    }

}
