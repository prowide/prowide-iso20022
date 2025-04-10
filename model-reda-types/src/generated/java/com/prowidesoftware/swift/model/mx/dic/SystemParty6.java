
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
 * Provides the definition of a party within a system. 
 * A party shall denote any legal or organisational entity required in the system. 
 * This entity shall store the parties from the first three levels: the system operator, the central securities depositaries, the participants of the central securities depositaries, the national central banks and payment banks.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemParty6", propOrder = {
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
public class SystemParty6 {

    @XmlElement(name = "PtyId")
    protected SystemPartyIdentification9 ptyId;
    @XmlElement(name = "Adr")
    protected PostalAddress28 adr;
    @XmlElement(name = "CtctDtls")
    protected List<Contact14> ctctDtls;
    @XmlElement(name = "OpngDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate opngDt;
    @XmlElement(name = "ClsgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate clsgDt;
    @XmlElement(name = "Tp")
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
    public SystemParty6 setPtyId(SystemPartyIdentification9 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress28 }
     *     
     */
    public PostalAddress28 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress28 }
     *     
     */
    public SystemParty6 setAdr(PostalAddress28 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctctDtls property.
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
     * {@link Contact14 }
     * 
     * 
     * @return
     *     The value of the ctctDtls property.
     */
    public List<Contact14> getCtctDtls() {
        if (ctctDtls == null) {
            ctctDtls = new ArrayList<>();
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
    public LocalDate getOpngDt() {
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
    public SystemParty6 setOpngDt(LocalDate value) {
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
    public LocalDate getClsgDt() {
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
    public SystemParty6 setClsgDt(LocalDate value) {
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
    public SystemParty6 setTp(SystemPartyType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the techAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the techAdr property.
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
     * @return
     *     The value of the techAdr property.
     */
    public List<TechnicalIdentification2Choice> getTechAdr() {
        if (techAdr == null) {
            techAdr = new ArrayList<>();
        }
        return this.techAdr;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mktSpcfcAttr property.
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
     * @return
     *     The value of the mktSpcfcAttr property.
     */
    public List<MarketSpecificAttribute1> getMktSpcfcAttr() {
        if (mktSpcfcAttr == null) {
            mktSpcfcAttr = new ArrayList<>();
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
    public SystemParty6 setNm(PartyName4 value) {
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
    public SystemParty6 setResTp(ResidenceType1Code value) {
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
    public SystemParty6 setLckSts(PartyLockStatus1 value) {
        this.lckSts = value;
        return this;
    }

    /**
     * Gets the value of the rstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rstrctn property.
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
     * @return
     *     The value of the rstrctn property.
     */
    public List<SystemRestriction1> getRstrctn() {
        if (rstrctn == null) {
            rstrctn = new ArrayList<>();
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
     * Adds a new item to the ctctDtls list.
     * @see #getCtctDtls()
     * 
     */
    public SystemParty6 addCtctDtls(Contact14 ctctDtls) {
        getCtctDtls().add(ctctDtls);
        return this;
    }

    /**
     * Adds a new item to the techAdr list.
     * @see #getTechAdr()
     * 
     */
    public SystemParty6 addTechAdr(TechnicalIdentification2Choice techAdr) {
        getTechAdr().add(techAdr);
        return this;
    }

    /**
     * Adds a new item to the mktSpcfcAttr list.
     * @see #getMktSpcfcAttr()
     * 
     */
    public SystemParty6 addMktSpcfcAttr(MarketSpecificAttribute1 mktSpcfcAttr) {
        getMktSpcfcAttr().add(mktSpcfcAttr);
        return this;
    }

    /**
     * Adds a new item to the rstrctn list.
     * @see #getRstrctn()
     * 
     */
    public SystemParty6 addRstrctn(SystemRestriction1 rstrctn) {
        getRstrctn().add(rstrctn);
        return this;
    }

}
