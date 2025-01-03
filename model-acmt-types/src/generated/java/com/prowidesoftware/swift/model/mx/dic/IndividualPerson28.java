
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
 * Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPerson28", propOrder = {
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
    "modfdPstlAdr",
    "modfdCtznsh",
    "emplngCpny",
    "bizFctn",
    "pltclyXpsdPrsnTp",
    "dthDt",
    "cvlSts",
    "edctnLvl",
    "fmlyInf"
})
public class IndividualPerson28 {

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
    protected LocalDate birthDt;
    @XmlElement(name = "CtryOfBirth")
    protected String ctryOfBirth;
    @XmlElement(name = "PrvcOfBirth")
    protected String prvcOfBirth;
    @XmlElement(name = "CityOfBirth")
    protected String cityOfBirth;
    @XmlElement(name = "Prfssn")
    protected String prfssn;
    @XmlElement(name = "ModfdPstlAdr")
    protected List<ModificationScope34> modfdPstlAdr;
    @XmlElement(name = "ModfdCtznsh")
    protected List<ModificationScope3> modfdCtznsh;
    @XmlElement(name = "EmplngCpny")
    protected String emplngCpny;
    @XmlElement(name = "BizFctn")
    protected String bizFctn;
    @XmlElement(name = "PltclyXpsdPrsnTp")
    protected PoliticalExposureType1Choice pltclyXpsdPrsnTp;
    @XmlElement(name = "DthDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dthDt;
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
    public IndividualPerson28 setNmPrfx(NamePrefix1Choice value) {
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
    public IndividualPerson28 setGvnNm(String value) {
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
    public IndividualPerson28 setMddlNm(String value) {
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
    public IndividualPerson28 setNm(String value) {
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
    public IndividualPerson28 setNmSfx(String value) {
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
    public IndividualPerson28 setGndr(GenderCode value) {
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
    public LocalDate getBirthDt() {
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
    public IndividualPerson28 setBirthDt(LocalDate value) {
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
    public IndividualPerson28 setCtryOfBirth(String value) {
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
    public IndividualPerson28 setPrvcOfBirth(String value) {
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
    public IndividualPerson28 setCityOfBirth(String value) {
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
    public IndividualPerson28 setPrfssn(String value) {
        this.prfssn = value;
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
     * {@link ModificationScope34 }
     * 
     * 
     * @return
     *     The value of the modfdPstlAdr property.
     */
    public List<ModificationScope34> getModfdPstlAdr() {
        if (modfdPstlAdr == null) {
            modfdPstlAdr = new ArrayList<>();
        }
        return this.modfdPstlAdr;
    }

    /**
     * Gets the value of the modfdCtznsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdCtznsh property.
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
     * @return
     *     The value of the modfdCtznsh property.
     */
    public List<ModificationScope3> getModfdCtznsh() {
        if (modfdCtznsh == null) {
            modfdCtznsh = new ArrayList<>();
        }
        return this.modfdCtznsh;
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
    public IndividualPerson28 setEmplngCpny(String value) {
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
    public IndividualPerson28 setBizFctn(String value) {
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
    public IndividualPerson28 setPltclyXpsdPrsnTp(PoliticalExposureType1Choice value) {
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
    public LocalDate getDthDt() {
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
    public IndividualPerson28 setDthDt(LocalDate value) {
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
    public IndividualPerson28 setCvlSts(CivilStatus1Choice value) {
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
    public IndividualPerson28 setEdctnLvl(String value) {
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
    public IndividualPerson28 setFmlyInf(PersonalInformation1 value) {
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
     * Adds a new item to the modfdPstlAdr list.
     * @see #getModfdPstlAdr()
     * 
     */
    public IndividualPerson28 addModfdPstlAdr(ModificationScope34 modfdPstlAdr) {
        getModfdPstlAdr().add(modfdPstlAdr);
        return this;
    }

    /**
     * Adds a new item to the modfdCtznsh list.
     * @see #getModfdCtznsh()
     * 
     */
    public IndividualPerson28 addModfdCtznsh(ModificationScope3 modfdCtznsh) {
        getModfdCtznsh().add(modfdCtznsh);
        return this;
    }

}
