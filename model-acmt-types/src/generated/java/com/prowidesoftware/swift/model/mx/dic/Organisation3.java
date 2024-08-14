
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
 * Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation3", propOrder = {
    "nm",
    "id",
    "purp",
    "taxtnCtry",
    "regnCtry",
    "regnDt",
    "taxIdNb",
    "ntlRegnNb",
    "modfdPstlAdr",
    "pmryComAdr",
    "scndryComAdr"
})
public class Organisation3 {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "Id")
    protected PartyIdentification4Choice id;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "TaxtnCtry")
    protected String taxtnCtry;
    @XmlElement(name = "RegnCtry")
    protected String regnCtry;
    @XmlElement(name = "RegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate regnDt;
    @XmlElement(name = "TaxIdNb")
    protected String taxIdNb;
    @XmlElement(name = "NtlRegnNb")
    protected String ntlRegnNb;
    @XmlElement(name = "ModfdPstlAdr")
    protected List<ModificationScope1> modfdPstlAdr;
    @XmlElement(name = "PmryComAdr")
    protected CommunicationAddress3 pmryComAdr;
    @XmlElement(name = "ScndryComAdr")
    protected CommunicationAddress3 scndryComAdr;

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
    public Organisation3 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification4Choice }
     *     
     */
    public PartyIdentification4Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification4Choice }
     *     
     */
    public Organisation3 setId(PartyIdentification4Choice value) {
        this.id = value;
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
    public Organisation3 setPurp(String value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the taxtnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtnCtry() {
        return taxtnCtry;
    }

    /**
     * Sets the value of the taxtnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation3 setTaxtnCtry(String value) {
        this.taxtnCtry = value;
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
    public Organisation3 setRegnCtry(String value) {
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
    public Organisation3 setRegnDt(LocalDate value) {
        this.regnDt = value;
        return this;
    }

    /**
     * Gets the value of the taxIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdNb() {
        return taxIdNb;
    }

    /**
     * Sets the value of the taxIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation3 setTaxIdNb(String value) {
        this.taxIdNb = value;
        return this;
    }

    /**
     * Gets the value of the ntlRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlRegnNb() {
        return ntlRegnNb;
    }

    /**
     * Sets the value of the ntlRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation3 setNtlRegnNb(String value) {
        this.ntlRegnNb = value;
        return this;
    }

    /**
     * Gets the value of the modfdPstlAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdPstlAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdPstlAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope1 }
     * 
     * 
     * @return
     *     The value of the modfdPstlAdr property.
     */
    public List<ModificationScope1> getModfdPstlAdr() {
        if (modfdPstlAdr == null) {
            modfdPstlAdr = new ArrayList<>();
        }
        return this.modfdPstlAdr;
    }

    /**
     * Gets the value of the pmryComAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public CommunicationAddress3 getPmryComAdr() {
        return pmryComAdr;
    }

    /**
     * Sets the value of the pmryComAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public Organisation3 setPmryComAdr(CommunicationAddress3 value) {
        this.pmryComAdr = value;
        return this;
    }

    /**
     * Gets the value of the scndryComAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public CommunicationAddress3 getScndryComAdr() {
        return scndryComAdr;
    }

    /**
     * Sets the value of the scndryComAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress3 }
     *     
     */
    public Organisation3 setScndryComAdr(CommunicationAddress3 value) {
        this.scndryComAdr = value;
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
     * Adds a new item to the modfdPstlAdr list.
     * @see #getModfdPstlAdr()
     * 
     */
    public Organisation3 addModfdPstlAdr(ModificationScope1 modfdPstlAdr) {
        getModfdPstlAdr().add(modfdPstlAdr);
        return this;
    }

}
