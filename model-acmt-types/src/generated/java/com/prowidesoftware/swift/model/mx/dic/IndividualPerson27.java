
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
 * Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPerson27", propOrder = {
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
    "pltclyXpsdPrsnTp",
    "dthDt",
    "cvlSts",
    "edctnLvl",
    "fmlyInf"
})
public class IndividualPerson27 {

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
    protected GenderCode gndr;
    @XmlElement(name = "BirthDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
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
    protected List<CitizenshipInformation> ctznsh;
    @XmlElement(name = "EmplngCpny")
    protected String emplngCpny;
    @XmlElement(name = "BizFctn")
    protected String bizFctn;
    @XmlElement(name = "PltclyXpsdPrsnTp")
    protected PoliticalExposureType1Choice pltclyXpsdPrsnTp;
    @XmlElement(name = "DthDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dthDt;
    @XmlElement(name = "CvlSts")
    protected CivilStatus1Choice cvlSts;
    @XmlElement(name = "EdctnLvl")
    protected String edctnLvl;
    @XmlElement(name = "FmlyInf")
    protected PersonalInformation1 fmlyInf;

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
    public IndividualPerson27 setNmPrfx(NamePrefix1Choice value) {
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
    public IndividualPerson27 setGvnNm(String value) {
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
    public IndividualPerson27 setMddlNm(String value) {
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
    public IndividualPerson27 setNm(String value) {
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
    public IndividualPerson27 setNmSfx(String value) {
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
    public IndividualPerson27 setGndr(GenderCode value) {
        this.gndr = value;
        return this;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public IndividualPerson27 setBirthDt(XMLGregorianCalendar value) {
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
    public IndividualPerson27 setCtryOfBirth(String value) {
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
    public IndividualPerson27 setPrvcOfBirth(String value) {
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
    public IndividualPerson27 setCityOfBirth(String value) {
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
    public IndividualPerson27 setPrfssn(String value) {
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
     * {@link CitizenshipInformation }
     * 
     * 
     */
    public List<CitizenshipInformation> getCtznsh() {
        if (ctznsh == null) {
            ctznsh = new ArrayList<CitizenshipInformation>();
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
    public IndividualPerson27 setEmplngCpny(String value) {
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
    public IndividualPerson27 setBizFctn(String value) {
        this.bizFctn = value;
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
    public IndividualPerson27 setPltclyXpsdPrsnTp(PoliticalExposureType1Choice value) {
        this.pltclyXpsdPrsnTp = value;
        return this;
    }

    /**
     * Gets the value of the dthDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public IndividualPerson27 setDthDt(XMLGregorianCalendar value) {
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
    public IndividualPerson27 setCvlSts(CivilStatus1Choice value) {
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
    public IndividualPerson27 setEdctnLvl(String value) {
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
    public IndividualPerson27 setFmlyInf(PersonalInformation1 value) {
        this.fmlyInf = value;
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
     * Adds a new item to the pstlAdr list.
     * @see #getPstlAdr()
     * 
     */
    public IndividualPerson27 addPstlAdr(PostalAddress21 pstlAdr) {
        getPstlAdr().add(pstlAdr);
        return this;
    }

    /**
     * Adds a new item to the ctznsh list.
     * @see #getCtznsh()
     * 
     */
    public IndividualPerson27 addCtznsh(CitizenshipInformation ctznsh) {
        getCtznsh().add(ctznsh);
        return this;
    }

}
