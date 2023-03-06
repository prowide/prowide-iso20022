
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
 * Provides the definition of a party within a system. 
 * A party shall denote any legal or organisational entity required in the system. 
 * This entity shall store the parties from the first three levels: the system operator, the central securities depositaries, the participants of the central securities depositaries, the national central banks and payment banks.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemParty4", propOrder = {
    "ptyId",
    "adr",
    "ctctDtls",
    "opngDt",
    "clsgDt",
    "tp",
    "techAdr",
    "mktSpcfcAttr",
    "nm",
    "resTp",
    "lckSts",
    "rstrctn"
})
public class SystemParty4 {

    @XmlElement(name = "PtyId", required = true)
    protected SystemPartyIdentification9 ptyId;
    @XmlElement(name = "Adr")
    protected List<PostalAddress25> adr;
    @XmlElement(name = "CtctDtls")
    protected List<Contact5> ctctDtls;
    @XmlElement(name = "OpngDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar opngDt;
    @XmlElement(name = "ClsgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clsgDt;
    @XmlElement(name = "Tp", required = true)
    protected SystemPartyType1Choice tp;
    @XmlElement(name = "TechAdr")
    protected List<TechnicalIdentification2Choice> techAdr;
    @XmlElement(name = "MktSpcfcAttr")
    protected List<MarketSpecificAttribute1> mktSpcfcAttr;
    @XmlElement(name = "Nm")
    protected PartyName4 nm;
    @XmlElement(name = "ResTp")
    @XmlSchemaType(name = "string")
    protected ResidenceType1Code resTp;
    @XmlElement(name = "LckSts")
    protected PartyLockStatus1 lckSts;
    @XmlElement(name = "Rstrctn")
    protected List<SystemRestriction1> rstrctn;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification9 }
     *     
     */
    public SystemPartyIdentification9 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification9 }
     *     
     */
    public SystemParty4 setPtyId(SystemPartyIdentification9 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress25 }
     * 
     * 
     */
    public List<PostalAddress25> getAdr() {
        if (adr == null) {
            adr = new ArrayList<PostalAddress25>();
        }
        return this.adr;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact5 }
     * 
     * 
     */
    public List<Contact5> getCtctDtls() {
        if (ctctDtls == null) {
            ctctDtls = new ArrayList<Contact5>();
        }
        return this.ctctDtls;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemParty4 setOpngDt(XMLGregorianCalendar value) {
        this.opngDt = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemParty4 setClsgDt(XMLGregorianCalendar value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public SystemPartyType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public SystemParty4 setTp(SystemPartyType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the techAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the techAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalIdentification2Choice }
     * 
     * 
     */
    public List<TechnicalIdentification2Choice> getTechAdr() {
        if (techAdr == null) {
            techAdr = new ArrayList<TechnicalIdentification2Choice>();
        }
        return this.techAdr;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mktSpcfcAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMktSpcfcAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSpecificAttribute1 }
     * 
     * 
     */
    public List<MarketSpecificAttribute1> getMktSpcfcAttr() {
        if (mktSpcfcAttr == null) {
            mktSpcfcAttr = new ArrayList<MarketSpecificAttribute1>();
        }
        return this.mktSpcfcAttr;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link PartyName4 }
     *     
     */
    public PartyName4 getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyName4 }
     *     
     */
    public SystemParty4 setNm(PartyName4 value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the resTp property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceType1Code }
     *     
     */
    public ResidenceType1Code getResTp() {
        return resTp;
    }

    /**
     * Sets the value of the resTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceType1Code }
     *     
     */
    public SystemParty4 setResTp(ResidenceType1Code value) {
        this.resTp = value;
        return this;
    }

    /**
     * Gets the value of the lckSts property.
     * 
     * @return
     *     possible object is
     *     {@link PartyLockStatus1 }
     *     
     */
    public PartyLockStatus1 getLckSts() {
        return lckSts;
    }

    /**
     * Sets the value of the lckSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyLockStatus1 }
     *     
     */
    public SystemParty4 setLckSts(PartyLockStatus1 value) {
        this.lckSts = value;
        return this;
    }

    /**
     * Gets the value of the rstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemRestriction1 }
     * 
     * 
     */
    public List<SystemRestriction1> getRstrctn() {
        if (rstrctn == null) {
            rstrctn = new ArrayList<SystemRestriction1>();
        }
        return this.rstrctn;
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
     * Adds a new item to the adr list.
     * @see #getAdr()
     * 
     */
    public SystemParty4 addAdr(PostalAddress25 adr) {
        getAdr().add(adr);
        return this;
    }

    /**
     * Adds a new item to the ctctDtls list.
     * @see #getCtctDtls()
     * 
     */
    public SystemParty4 addCtctDtls(Contact5 ctctDtls) {
        getCtctDtls().add(ctctDtls);
        return this;
    }

    /**
     * Adds a new item to the techAdr list.
     * @see #getTechAdr()
     * 
     */
    public SystemParty4 addTechAdr(TechnicalIdentification2Choice techAdr) {
        getTechAdr().add(techAdr);
        return this;
    }

    /**
     * Adds a new item to the mktSpcfcAttr list.
     * @see #getMktSpcfcAttr()
     * 
     */
    public SystemParty4 addMktSpcfcAttr(MarketSpecificAttribute1 mktSpcfcAttr) {
        getMktSpcfcAttr().add(mktSpcfcAttr);
        return this;
    }

    /**
     * Adds a new item to the rstrctn list.
     * @see #getRstrctn()
     * 
     */
    public SystemParty4 addRstrctn(SystemRestriction1 rstrctn) {
        getRstrctn().add(rstrctn);
        return this;
    }

}
