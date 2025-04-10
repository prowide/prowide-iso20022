
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
@XmlType(name = "IndividualPerson20", propOrder = {
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
    "pstlAdr",
    "ctznsh",
    "emplngCpny",
    "bizFctn",
    "pmryComAdr",
    "scndryComAdr",
    "othrId",
    "addtlRgltryInf"
})
public class IndividualPerson20 {

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
    @XmlElement(name = "BirthDt", required = true, type = String.class)
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
    @XmlElement(name = "TaxtnCtry")
    protected String taxtnCtry;
    @XmlElement(name = "CtryAndResdtlSts")
    protected CountryAndResidentialStatusType1 ctryAndResdtlSts;
    @XmlElement(name = "PstlAdr", required = true)
    protected List<PostalAddress3> pstlAdr;
    @XmlElement(name = "Ctznsh", required = true)
    protected List<CitizenshipInformation> ctznsh;
    @XmlElement(name = "EmplngCpny")
    protected String emplngCpny;
    @XmlElement(name = "BizFctn")
    protected String bizFctn;
    @XmlElement(name = "PmryComAdr")
    protected CommunicationAddress3 pmryComAdr;
    @XmlElement(name = "ScndryComAdr")
    protected CommunicationAddress3 scndryComAdr;
    @XmlElement(name = "OthrId")
    protected List<GenericIdentification44> othrId;
    @XmlElement(name = "AddtlRgltryInf")
    protected RegulatoryInformation1 addtlRgltryInf;

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
    public IndividualPerson20 setNmPrfx(NamePrefix1Choice value) {
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
    public IndividualPerson20 setGvnNm(String value) {
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
    public IndividualPerson20 setMddlNm(String value) {
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
    public IndividualPerson20 setNm(String value) {
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
    public IndividualPerson20 setNmSfx(String value) {
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
    public IndividualPerson20 setGndr(GenderCode value) {
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
    public IndividualPerson20 setLang(String value) {
        this.lang = value;
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
    public IndividualPerson20 setBirthDt(LocalDate value) {
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
    public IndividualPerson20 setCtryOfBirth(String value) {
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
    public IndividualPerson20 setPrvcOfBirth(String value) {
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
    public IndividualPerson20 setCityOfBirth(String value) {
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
    public IndividualPerson20 setPrfssn(String value) {
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
    public IndividualPerson20 setTaxtnCtry(String value) {
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
    public IndividualPerson20 setCtryAndResdtlSts(CountryAndResidentialStatusType1 value) {
        this.ctryAndResdtlSts = value;
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
     * {@link PostalAddress3 }
     * 
     * 
     * @return
     *     The value of the pstlAdr property.
     */
    public List<PostalAddress3> getPstlAdr() {
        if (pstlAdr == null) {
            pstlAdr = new ArrayList<>();
        }
        return this.pstlAdr;
    }

    /**
     * Gets the value of the ctznsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctznsh property.
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
     * @return
     *     The value of the ctznsh property.
     */
    public List<CitizenshipInformation> getCtznsh() {
        if (ctznsh == null) {
            ctznsh = new ArrayList<>();
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
    public IndividualPerson20 setEmplngCpny(String value) {
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
    public IndividualPerson20 setBizFctn(String value) {
        this.bizFctn = value;
        return this;
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
    public IndividualPerson20 setPmryComAdr(CommunicationAddress3 value) {
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
    public IndividualPerson20 setScndryComAdr(CommunicationAddress3 value) {
        this.scndryComAdr = value;
        return this;
    }

    /**
     * Gets the value of the othrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification44 }
     * 
     * 
     * @return
     *     The value of the othrId property.
     */
    public List<GenericIdentification44> getOthrId() {
        if (othrId == null) {
            othrId = new ArrayList<>();
        }
        return this.othrId;
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
    public IndividualPerson20 setAddtlRgltryInf(RegulatoryInformation1 value) {
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
     * Adds a new item to the pstlAdr list.
     * @see #getPstlAdr()
     * 
     */
    public IndividualPerson20 addPstlAdr(PostalAddress3 pstlAdr) {
        getPstlAdr().add(pstlAdr);
        return this;
    }

    /**
     * Adds a new item to the ctznsh list.
     * @see #getCtznsh()
     * 
     */
    public IndividualPerson20 addCtznsh(CitizenshipInformation ctznsh) {
        getCtznsh().add(ctznsh);
        return this;
    }

    /**
     * Adds a new item to the othrId list.
     * @see #getOthrId()
     * 
     */
    public IndividualPerson20 addOthrId(GenericIdentification44 othrId) {
        getOthrId().add(othrId);
        return this;
    }

}
