
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
@XmlType(name = "IndividualPerson9", propOrder = {
    "nm",
    "birthDt",
    "ctryAndResdtlSts",
    "bnfcryCertfctnCmpltn",
    "othrId"
})
public class IndividualPerson9 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "BirthDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "CtryAndResdtlSts")
    protected CountryAndResidentialStatusType1 ctryAndResdtlSts;
    @XmlElement(name = "BnfcryCertfctnCmpltn")
    @XmlSchemaType(name = "string")
    protected BeneficiaryCertificationCompletion1Code bnfcryCertfctnCmpltn;
    @XmlElement(name = "OthrId")
    protected List<GenericIdentification11> othrId;

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
    public IndividualPerson9 setNm(String value) {
        this.nm = value;
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
    public IndividualPerson9 setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
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
    public IndividualPerson9 setCtryAndResdtlSts(CountryAndResidentialStatusType1 value) {
        this.ctryAndResdtlSts = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryCertfctnCmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryCertificationCompletion1Code }
     *     
     */
    public BeneficiaryCertificationCompletion1Code getBnfcryCertfctnCmpltn() {
        return bnfcryCertfctnCmpltn;
    }

    /**
     * Sets the value of the bnfcryCertfctnCmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryCertificationCompletion1Code }
     *     
     */
    public IndividualPerson9 setBnfcryCertfctnCmpltn(BeneficiaryCertificationCompletion1Code value) {
        this.bnfcryCertfctnCmpltn = value;
        return this;
    }

    /**
     * Gets the value of the othrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrId property.
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
     * {@link GenericIdentification11 }
     * 
     * 
     */
    public List<GenericIdentification11> getOthrId() {
        if (othrId == null) {
            othrId = new ArrayList<GenericIdentification11>();
        }
        return this.othrId;
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
     * Adds a new item to the othrId list.
     * @see #getOthrId()
     * 
     */
    public IndividualPerson9 addOthrId(GenericIdentification11 othrId) {
        getOthrId().add(othrId);
        return this;
    }

}
