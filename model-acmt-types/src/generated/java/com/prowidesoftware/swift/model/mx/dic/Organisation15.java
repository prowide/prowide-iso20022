
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "Organisation15", propOrder = {
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
    "scndryComAdr",
    "addtlRgltryInf"
})
public class Organisation15 {

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
    protected XMLGregorianCalendar regnDt;
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
    @XmlElement(name = "AddtlRgltryInf")
    protected RegulatoryInformation1 addtlRgltryInf;

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
    public Organisation15 setNm(String value) {
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
    public Organisation15 setId(PartyIdentification4Choice value) {
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
    public Organisation15 setPurp(String value) {
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
    public Organisation15 setTaxtnCtry(String value) {
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
    public Organisation15 setRegnCtry(String value) {
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
    public XMLGregorianCalendar getRegnDt() {
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
    public Organisation15 setRegnDt(XMLGregorianCalendar value) {
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
    public Organisation15 setTaxIdNb(String value) {
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
    public Organisation15 setNtlRegnNb(String value) {
        this.ntlRegnNb = value;
        return this;
    }

    /**
     * Gets the value of the modfdPstlAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdPstlAdr property.
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
     */
    public List<ModificationScope1> getModfdPstlAdr() {
        if (modfdPstlAdr == null) {
            modfdPstlAdr = new ArrayList<ModificationScope1>();
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
    public Organisation15 setPmryComAdr(CommunicationAddress3 value) {
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
    public Organisation15 setScndryComAdr(CommunicationAddress3 value) {
        this.scndryComAdr = value;
        return this;
    }

    /**
     * Gets the value of the addtlRgltryInf property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryInformation1 }
     *     
     */
    public RegulatoryInformation1 getAddtlRgltryInf() {
        return addtlRgltryInf;
    }

    /**
     * Sets the value of the addtlRgltryInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryInformation1 }
     *     
     */
    public Organisation15 setAddtlRgltryInf(RegulatoryInformation1 value) {
        this.addtlRgltryInf = value;
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
    public Organisation15 addModfdPstlAdr(ModificationScope1 modfdPstlAdr) {
        getModfdPstlAdr().add(modfdPstlAdr);
        return this;
    }

}
