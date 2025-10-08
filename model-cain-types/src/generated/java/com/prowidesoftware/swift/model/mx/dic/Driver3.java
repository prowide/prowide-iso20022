
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
 * Fleet vehicle driver.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Driver3", propOrder = {
    "nm",
    "id",
    "licTp",
    "licForm",
    "licId",
    "licAssgnr",
    "licIssncDt",
    "licXprtnDt",
    "licCtry",
    "licCtrySubDvsnMjr",
    "licCtrySubDvsnMnr",
    "licOthrAuthrty",
    "mplyr",
    "mplyeeId",
    "deptNb",
    "addtlId",
    "dtOfBirth",
    "addtlData"
})
public class Driver3 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "LicTp")
    protected String licTp;
    @XmlElement(name = "LicForm")
    @XmlSchemaType(name = "string")
    protected PresentationMedium2Code licForm;
    @XmlElement(name = "LicId")
    protected String licId;
    @XmlElement(name = "LicAssgnr")
    @XmlSchemaType(name = "string")
    protected LegalStructure1Code licAssgnr;
    @XmlElement(name = "LicIssncDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate licIssncDt;
    @XmlElement(name = "LicXprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate licXprtnDt;
    @XmlElement(name = "LicCtry")
    protected String licCtry;
    @XmlElement(name = "LicCtrySubDvsnMjr")
    protected String licCtrySubDvsnMjr;
    @XmlElement(name = "LicCtrySubDvsnMnr")
    protected String licCtrySubDvsnMnr;
    @XmlElement(name = "LicOthrAuthrty")
    protected String licOthrAuthrty;
    @XmlElement(name = "Mplyr")
    protected String mplyr;
    @XmlElement(name = "MplyeeId")
    protected String mplyeeId;
    @XmlElement(name = "DeptNb")
    protected String deptNb;
    @XmlElement(name = "AddtlId")
    protected List<TravelDocument2> addtlId;
    @XmlElement(name = "DtOfBirth", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtOfBirth;
    @XmlElement(name = "AddtlData")
    protected AdditionalData1 addtlData;

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
    public Driver3 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the licTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicTp() {
        return licTp;
    }

    /**
     * Sets the value of the licTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setLicTp(String value) {
        this.licTp = value;
        return this;
    }

    /**
     * Gets the value of the licForm property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationMedium2Code }
     *     
     */
    public PresentationMedium2Code getLicForm() {
        return licForm;
    }

    /**
     * Sets the value of the licForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationMedium2Code }
     *     
     */
    public Driver3 setLicForm(PresentationMedium2Code value) {
        this.licForm = value;
        return this;
    }

    /**
     * Gets the value of the licId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicId() {
        return licId;
    }

    /**
     * Sets the value of the licId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setLicId(String value) {
        this.licId = value;
        return this;
    }

    /**
     * Gets the value of the licAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link LegalStructure1Code }
     *     
     */
    public LegalStructure1Code getLicAssgnr() {
        return licAssgnr;
    }

    /**
     * Sets the value of the licAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalStructure1Code }
     *     
     */
    public Driver3 setLicAssgnr(LegalStructure1Code value) {
        this.licAssgnr = value;
        return this;
    }

    /**
     * Gets the value of the licIssncDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLicIssncDt() {
        return licIssncDt;
    }

    /**
     * Sets the value of the licIssncDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setLicIssncDt(LocalDate value) {
        this.licIssncDt = value;
        return this;
    }

    /**
     * Gets the value of the licXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLicXprtnDt() {
        return licXprtnDt;
    }

    /**
     * Sets the value of the licXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setLicXprtnDt(LocalDate value) {
        this.licXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the licCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicCtry() {
        return licCtry;
    }

    /**
     * Sets the value of the licCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setLicCtry(String value) {
        this.licCtry = value;
        return this;
    }

    /**
     * Gets the value of the licCtrySubDvsnMjr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicCtrySubDvsnMjr() {
        return licCtrySubDvsnMjr;
    }

    /**
     * Sets the value of the licCtrySubDvsnMjr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setLicCtrySubDvsnMjr(String value) {
        this.licCtrySubDvsnMjr = value;
        return this;
    }

    /**
     * Gets the value of the licCtrySubDvsnMnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicCtrySubDvsnMnr() {
        return licCtrySubDvsnMnr;
    }

    /**
     * Sets the value of the licCtrySubDvsnMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setLicCtrySubDvsnMnr(String value) {
        this.licCtrySubDvsnMnr = value;
        return this;
    }

    /**
     * Gets the value of the licOthrAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicOthrAuthrty() {
        return licOthrAuthrty;
    }

    /**
     * Sets the value of the licOthrAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setLicOthrAuthrty(String value) {
        this.licOthrAuthrty = value;
        return this;
    }

    /**
     * Gets the value of the mplyr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyr() {
        return mplyr;
    }

    /**
     * Sets the value of the mplyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setMplyr(String value) {
        this.mplyr = value;
        return this;
    }

    /**
     * Gets the value of the mplyeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeeId() {
        return mplyeeId;
    }

    /**
     * Sets the value of the mplyeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setMplyeeId(String value) {
        this.mplyeeId = value;
        return this;
    }

    /**
     * Gets the value of the deptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptNb() {
        return deptNb;
    }

    /**
     * Sets the value of the deptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setDeptNb(String value) {
        this.deptNb = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocument2 }
     * 
     * 
     * @return
     *     The value of the addtlId property.
     */
    public List<TravelDocument2> getAddtlId() {
        if (addtlId == null) {
            addtlId = new ArrayList<>();
        }
        return this.addtlId;
    }

    /**
     * Gets the value of the dtOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtOfBirth() {
        return dtOfBirth;
    }

    /**
     * Sets the value of the dtOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver3 setDtOfBirth(LocalDate value) {
        this.dtOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalData1 }
     *     
     */
    public AdditionalData1 getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalData1 }
     *     
     */
    public Driver3 setAddtlData(AdditionalData1 value) {
        this.addtlData = value;
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
     * Adds a new item to the addtlId list.
     * @see #getAddtlId()
     * 
     */
    public Driver3 addAddtlId(TravelDocument2 addtlId) {
        getAddtlId().add(addtlId);
        return this;
    }

}
