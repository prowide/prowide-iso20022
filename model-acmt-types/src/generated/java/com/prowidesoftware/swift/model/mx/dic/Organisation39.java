
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation39", propOrder = {
    "nm",
    "shrtNm",
    "id",
    "lglNttyIdr",
    "purp",
    "regnCtry",
    "regnDt",
    "pstlAdr",
    "tpOfOrg",
    "plcOfListg"
})
public class Organisation39 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "Id")
    protected PartyIdentification177Choice id;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "RegnCtry")
    protected String regnCtry;
    @XmlElement(name = "RegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate regnDt;
    @XmlElement(name = "PstlAdr")
    protected List<PostalAddress21> pstlAdr;
    @XmlElement(name = "TpOfOrg")
    protected OrganisationType1Choice tpOfOrg;
    @XmlElement(name = "PlcOfListg")
    protected List<String> plcOfListg;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation39 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation39 setShrtNm(String value) {
        this.shrtNm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public PartyIdentification177Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public Organisation39 setId(PartyIdentification177Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the lglNttyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglNttyIdr() {
        return lglNttyIdr;
    }

    /**
     * Sets the value of the lglNttyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation39 setLglNttyIdr(String value) {
        this.lglNttyIdr = value;
        return this;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation39 setPurp(String value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the regnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnCtry() {
        return regnCtry;
    }

    /**
     * Sets the value of the regnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation39 setRegnCtry(String value) {
        this.regnCtry = value;
        return this;
    }

    /**
     * Gets the value of the regnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRegnDt() {
        return regnDt;
    }

    /**
     * Sets the value of the regnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation39 setRegnDt(LocalDate value) {
        this.regnDt = value;
        return this;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pstlAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPstlAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress21 }
     * 
     * 
     * @return
     *     The value of the pstlAdr property.
     */
    public List<PostalAddress21> getPstlAdr() {
        if (pstlAdr == null) {
            pstlAdr = new ArrayList<>();
        }
        return this.pstlAdr;
    }

    /**
     * Gets the value of the tpOfOrg property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType1Choice }
     *     
     */
    public OrganisationType1Choice getTpOfOrg() {
        return tpOfOrg;
    }

    /**
     * Sets the value of the tpOfOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType1Choice }
     *     
     */
    public Organisation39 setTpOfOrg(OrganisationType1Choice value) {
        this.tpOfOrg = value;
        return this;
    }

    /**
     * Gets the value of the plcOfListg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the plcOfListg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlcOfListg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the plcOfListg property.
     */
    public List<String> getPlcOfListg() {
        if (plcOfListg == null) {
            plcOfListg = new ArrayList<>();
        }
        return this.plcOfListg;
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
     * Adds a new item to the pstlAdr list.
     * @see #getPstlAdr()
     * 
     */
    public Organisation39 addPstlAdr(PostalAddress21 pstlAdr) {
        getPstlAdr().add(pstlAdr);
        return this;
    }

    /**
     * Adds a new item to the plcOfListg list.
     * @see #getPlcOfListg()
     * 
     */
    public Organisation39 addPlcOfListg(String plcOfListg) {
        getPlcOfListg().add(plcOfListg);
        return this;
    }

}
