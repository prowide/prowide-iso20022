
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPerson24", propOrder = {
    "nmPrfx",
    "gvnNm",
    "mddlNm",
    "nm",
    "nmSfx",
    "gndr",
    "lang",
    "birthDt",
    "ctryOfBirth",
    "prvcOfBirth",
    "cityOfBirth",
    "prfssn",
    "taxtnCtry",
    "ctryAndResdtlSts",
    "bizFctn",
    "emplngCpny",
    "modfdPstlAdr",
    "modfdCtznsh",
    "pmryComAdr",
    "scndryComAdr",
    "modfdOthrId",
    "addtlRgltryInf",
    "pltclyXpsdPrsnTp"
})
public class IndividualPerson24 {

    @XmlElement(name = "NmPrfx")
    protected NamePrefix1Choice nmPrfx;
    @XmlElement(name = "GvnNm", required = true)
    protected String gvnNm;
    @XmlElement(name = "MddlNm")
    protected String mddlNm;
    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "NmSfx")
    protected String nmSfx;
    @XmlElement(name = "Gndr")
    @XmlSchemaType(name = "string")
    protected GenderCode gndr;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "BirthDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "CtryOfBirth")
    protected String ctryOfBirth;
    @XmlElement(name = "PrvcOfBirth")
    protected String prvcOfBirth;
    @XmlElement(name = "CityOfBirth")
    protected String cityOfBirth;
    @XmlElement(name = "Prfssn")
    protected String prfssn;
    @XmlElement(name = "TaxtnCtry")
    protected String taxtnCtry;
    @XmlElement(name = "CtryAndResdtlSts")
    protected CountryAndResidentialStatusType1 ctryAndResdtlSts;
    @XmlElement(name = "BizFctn")
    protected String bizFctn;
    @XmlElement(name = "EmplngCpny")
    protected String emplngCpny;
    @XmlElement(name = "ModfdPstlAdr")
    protected List<ModificationScope1> modfdPstlAdr;
    @XmlElement(name = "ModfdCtznsh")
    protected List<ModificationScope3> modfdCtznsh;
    @XmlElement(name = "PmryComAdr")
    protected CommunicationAddress3 pmryComAdr;
    @XmlElement(name = "ScndryComAdr")
    protected CommunicationAddress3 scndryComAdr;
    @XmlElement(name = "ModfdOthrId")
    protected List<ModificationScope23> modfdOthrId;
    @XmlElement(name = "AddtlRgltryInf")
    protected RegulatoryInformation1 addtlRgltryInf;
    @XmlElement(name = "PltclyXpsdPrsnTp")
    protected PoliticalExposureType1Choice pltclyXpsdPrsnTp;

    /**
     * Gets the value of the nmPrfx property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix1Choice }
     *     
     */
    public NamePrefix1Choice getNmPrfx() {
        return nmPrfx;
    }

    /**
     * Sets the value of the nmPrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix1Choice }
     *     
     */
    public IndividualPerson24 setNmPrfx(NamePrefix1Choice value) {
        this.nmPrfx = value;
        return this;
    }

    /**
     * Gets the value of the gvnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvnNm() {
        return gvnNm;
    }

    /**
     * Sets the value of the gvnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson24 setGvnNm(String value) {
        this.gvnNm = value;
        return this;
    }

    /**
     * Gets the value of the mddlNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMddlNm() {
        return mddlNm;
    }

    /**
     * Sets the value of the mddlNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson24 setMddlNm(String value) {
        this.mddlNm = value;
        return this;
    }

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
    public IndividualPerson24 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the nmSfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmSfx() {
        return nmSfx;
    }

    /**
     * Sets the value of the nmSfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson24 setNmSfx(String value) {
        this.nmSfx = value;
        return this;
    }

    /**
     * Gets the value of the gndr property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCode }
     *     
     */
    public GenderCode getGndr() {
        return gndr;
    }

    /**
     * Sets the value of the gndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCode }
     *     
     */
    public IndividualPerson24 setGndr(GenderCode value) {
        this.gndr = value;
        return this;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson24 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public IndividualPerson24 setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfBirth() {
        return ctryOfBirth;
    }

    /**
     * Sets the value of the ctryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson24 setCtryOfBirth(String value) {
        this.ctryOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the prvcOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvcOfBirth() {
        return prvcOfBirth;
    }

    /**
     * Sets the value of the prvcOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson24 setPrvcOfBirth(String value) {
        this.prvcOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the cityOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOfBirth() {
        return cityOfBirth;
    }

    /**
     * Sets the value of the cityOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson24 setCityOfBirth(String value) {
        this.cityOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the prfssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrfssn() {
        return prfssn;
    }

    /**
     * Sets the value of the prfssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson24 setPrfssn(String value) {
        this.prfssn = value;
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
    public IndividualPerson24 setTaxtnCtry(String value) {
        this.taxtnCtry = value;
        return this;
    }

    /**
     * Gets the value of the ctryAndResdtlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CountryAndResidentialStatusType1 }
     *     
     */
    public CountryAndResidentialStatusType1 getCtryAndResdtlSts() {
        return ctryAndResdtlSts;
    }

    /**
     * Sets the value of the ctryAndResdtlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryAndResidentialStatusType1 }
     *     
     */
    public IndividualPerson24 setCtryAndResdtlSts(CountryAndResidentialStatusType1 value) {
        this.ctryAndResdtlSts = value;
        return this;
    }

    /**
     * Gets the value of the bizFctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizFctn() {
        return bizFctn;
    }

    /**
     * Sets the value of the bizFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson24 setBizFctn(String value) {
        this.bizFctn = value;
        return this;
    }

    /**
     * Gets the value of the emplngCpny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplngCpny() {
        return emplngCpny;
    }

    /**
     * Sets the value of the emplngCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson24 setEmplngCpny(String value) {
        this.emplngCpny = value;
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
     * Gets the value of the modfdCtznsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdCtznsh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdCtznsh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope3 }
     * 
     * 
     */
    public List<ModificationScope3> getModfdCtznsh() {
        if (modfdCtznsh == null) {
            modfdCtznsh = new ArrayList<ModificationScope3>();
        }
        return this.modfdCtznsh;
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
    public IndividualPerson24 setPmryComAdr(CommunicationAddress3 value) {
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
    public IndividualPerson24 setScndryComAdr(CommunicationAddress3 value) {
        this.scndryComAdr = value;
        return this;
    }

    /**
     * Gets the value of the modfdOthrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdOthrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdOthrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope23 }
     * 
     * 
     */
    public List<ModificationScope23> getModfdOthrId() {
        if (modfdOthrId == null) {
            modfdOthrId = new ArrayList<ModificationScope23>();
        }
        return this.modfdOthrId;
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
    public IndividualPerson24 setAddtlRgltryInf(RegulatoryInformation1 value) {
        this.addtlRgltryInf = value;
        return this;
    }

    /**
     * Gets the value of the pltclyXpsdPrsnTp property.
     * 
     * @return
     *     possible object is
     *     {@link PoliticalExposureType1Choice }
     *     
     */
    public PoliticalExposureType1Choice getPltclyXpsdPrsnTp() {
        return pltclyXpsdPrsnTp;
    }

    /**
     * Sets the value of the pltclyXpsdPrsnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticalExposureType1Choice }
     *     
     */
    public IndividualPerson24 setPltclyXpsdPrsnTp(PoliticalExposureType1Choice value) {
        this.pltclyXpsdPrsnTp = value;
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
    public IndividualPerson24 addModfdPstlAdr(ModificationScope1 modfdPstlAdr) {
        getModfdPstlAdr().add(modfdPstlAdr);
        return this;
    }

    /**
     * Adds a new item to the modfdCtznsh list.
     * @see #getModfdCtznsh()
     * 
     */
    public IndividualPerson24 addModfdCtznsh(ModificationScope3 modfdCtznsh) {
        getModfdCtznsh().add(modfdCtznsh);
        return this;
    }

    /**
     * Adds a new item to the modfdOthrId list.
     * @see #getModfdOthrId()
     * 
     */
    public IndividualPerson24 addModfdOthrId(ModificationScope23 modfdOthrId) {
        getModfdOthrId().add(modfdOthrId);
        return this;
    }

}
