
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
@XmlType(name = "IndividualPerson37", propOrder = {
    "nmPrfx",
    "gvnNm",
    "mddlNm",
    "nm",
    "nmSfx",
    "gndr",
    "birthDt",
    "ctryOfBirth",
    "prvcOfBirth",
    "cityOfBirth",
    "prfssn",
    "pstlAdr",
    "ctznsh",
    "emplngCpny",
    "bizFctn",
    "pltclyXpsdPrsn",
    "dthDt",
    "cvlSts",
    "edctnLvl",
    "fmlyInf",
    "gdprData"
})
public class IndividualPerson37 {

    @XmlElement(name = "NmPrfx")
    protected NamePrefix1Choice nmPrfx;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "MddlNm")
    protected String mddlNm;
    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "NmSfx")
    protected String nmSfx;
    @XmlElement(name = "Gndr")
    @XmlSchemaType(name = "string")
    protected Gender1Code gndr;
    @XmlElement(name = "BirthDt")
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
    @XmlElement(name = "PstlAdr", required = true)
    protected List<PostalAddress21> pstlAdr;
    @XmlElement(name = "Ctznsh")
    protected List<CitizenshipInformation2> ctznsh;
    @XmlElement(name = "EmplngCpny")
    protected String emplngCpny;
    @XmlElement(name = "BizFctn")
    protected String bizFctn;
    @XmlElement(name = "PltclyXpsdPrsn")
    protected PoliticallyExposedPerson1 pltclyXpsdPrsn;
    @XmlElement(name = "DthDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dthDt;
    @XmlElement(name = "CvlSts")
    protected CivilStatus1Choice cvlSts;
    @XmlElement(name = "EdctnLvl")
    protected String edctnLvl;
    @XmlElement(name = "FmlyInf")
    protected PersonalInformation1 fmlyInf;
    @XmlElement(name = "GDPRData")
    protected List<GDPRData1> gdprData;

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
    public IndividualPerson37 setNmPrfx(NamePrefix1Choice value) {
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
    public IndividualPerson37 setGvnNm(String value) {
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
    public IndividualPerson37 setMddlNm(String value) {
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
    public IndividualPerson37 setNm(String value) {
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
    public IndividualPerson37 setNmSfx(String value) {
        this.nmSfx = value;
        return this;
    }

    /**
     * Gets the value of the gndr property.
     * 
     * @return
     *     possible object is
     *     {@link Gender1Code }
     *     
     */
    public Gender1Code getGndr() {
        return gndr;
    }

    /**
     * Sets the value of the gndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender1Code }
     *     
     */
    public IndividualPerson37 setGndr(Gender1Code value) {
        this.gndr = value;
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
    public IndividualPerson37 setBirthDt(XMLGregorianCalendar value) {
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
    public IndividualPerson37 setCtryOfBirth(String value) {
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
    public IndividualPerson37 setPrvcOfBirth(String value) {
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
    public IndividualPerson37 setCityOfBirth(String value) {
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
    public IndividualPerson37 setPrfssn(String value) {
        this.prfssn = value;
        return this;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pstlAdr property.
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
     */
    public List<PostalAddress21> getPstlAdr() {
        if (pstlAdr == null) {
            pstlAdr = new ArrayList<PostalAddress21>();
        }
        return this.pstlAdr;
    }

    /**
     * Gets the value of the ctznsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctznsh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtznsh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenshipInformation2 }
     * 
     * 
     */
    public List<CitizenshipInformation2> getCtznsh() {
        if (ctznsh == null) {
            ctznsh = new ArrayList<CitizenshipInformation2>();
        }
        return this.ctznsh;
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
    public IndividualPerson37 setEmplngCpny(String value) {
        this.emplngCpny = value;
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
    public IndividualPerson37 setBizFctn(String value) {
        this.bizFctn = value;
        return this;
    }

    /**
     * Gets the value of the pltclyXpsdPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PoliticallyExposedPerson1 }
     *     
     */
    public PoliticallyExposedPerson1 getPltclyXpsdPrsn() {
        return pltclyXpsdPrsn;
    }

    /**
     * Sets the value of the pltclyXpsdPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticallyExposedPerson1 }
     *     
     */
    public IndividualPerson37 setPltclyXpsdPrsn(PoliticallyExposedPerson1 value) {
        this.pltclyXpsdPrsn = value;
        return this;
    }

    /**
     * Gets the value of the dthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDthDt() {
        return dthDt;
    }

    /**
     * Sets the value of the dthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public IndividualPerson37 setDthDt(XMLGregorianCalendar value) {
        this.dthDt = value;
        return this;
    }

    /**
     * Gets the value of the cvlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CivilStatus1Choice }
     *     
     */
    public CivilStatus1Choice getCvlSts() {
        return cvlSts;
    }

    /**
     * Sets the value of the cvlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CivilStatus1Choice }
     *     
     */
    public IndividualPerson37 setCvlSts(CivilStatus1Choice value) {
        this.cvlSts = value;
        return this;
    }

    /**
     * Gets the value of the edctnLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdctnLvl() {
        return edctnLvl;
    }

    /**
     * Sets the value of the edctnLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPerson37 setEdctnLvl(String value) {
        this.edctnLvl = value;
        return this;
    }

    /**
     * Gets the value of the fmlyInf property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInformation1 }
     *     
     */
    public PersonalInformation1 getFmlyInf() {
        return fmlyInf;
    }

    /**
     * Sets the value of the fmlyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInformation1 }
     *     
     */
    public IndividualPerson37 setFmlyInf(PersonalInformation1 value) {
        this.fmlyInf = value;
        return this;
    }

    /**
     * Gets the value of the gdprData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdprData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDPRData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GDPRData1 }
     * 
     * 
     */
    public List<GDPRData1> getGDPRData() {
        if (gdprData == null) {
            gdprData = new ArrayList<GDPRData1>();
        }
        return this.gdprData;
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
    public IndividualPerson37 addPstlAdr(PostalAddress21 pstlAdr) {
        getPstlAdr().add(pstlAdr);
        return this;
    }

    /**
     * Adds a new item to the ctznsh list.
     * @see #getCtznsh()
     * 
     */
    public IndividualPerson37 addCtznsh(CitizenshipInformation2 ctznsh) {
        getCtznsh().add(ctznsh);
        return this;
    }

    /**
     * Adds a new item to the gDPRData list.
     * @see #getGDPRData()
     * 
     */
    public IndividualPerson37 addGDPRData(GDPRData1 gDPRData) {
        getGDPRData().add(gDPRData);
        return this;
    }

}
