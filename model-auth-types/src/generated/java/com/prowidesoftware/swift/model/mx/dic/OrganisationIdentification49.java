
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the identification of the organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification49", propOrder = {
    "lei",
    "orgNm",
    "altrnOrgId",
    "regdCtry",
    "nttySz",
    "sctr",
    "prsnNm",
    "npi",
    "nttyTp"
})
public class OrganisationIdentification49 {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "OrgNm")
    protected List<PartyName5> orgNm;
    @XmlElement(name = "AltrnOrgId")
    protected List<GenericOrganisationIdentification3> altrnOrgId;
    @XmlElement(name = "RegdCtry")
    protected String regdCtry;
    @XmlElement(name = "NttySz")
    protected String nttySz;
    @XmlElement(name = "Sctr")
    protected List<IndustrySector3Choice> sctr;
    @XmlElement(name = "PrsnNm")
    protected List<String> prsnNm;
    @XmlElement(name = "NPI")
    protected String npi;
    @XmlElement(name = "NttyTp")
    protected String nttyTp;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification49 setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the orgNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyName5 }
     * 
     * 
     * @return
     *     The value of the orgNm property.
     */
    public List<PartyName5> getOrgNm() {
        if (orgNm == null) {
            orgNm = new ArrayList<>();
        }
        return this.orgNm;
    }

    /**
     * Gets the value of the altrnOrgId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrnOrgId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnOrgId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericOrganisationIdentification3 }
     * 
     * 
     * @return
     *     The value of the altrnOrgId property.
     */
    public List<GenericOrganisationIdentification3> getAltrnOrgId() {
        if (altrnOrgId == null) {
            altrnOrgId = new ArrayList<>();
        }
        return this.altrnOrgId;
    }

    /**
     * Gets the value of the regdCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdCtry() {
        return regdCtry;
    }

    /**
     * Sets the value of the regdCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification49 setRegdCtry(String value) {
        this.regdCtry = value;
        return this;
    }

    /**
     * Gets the value of the nttySz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNttySz() {
        return nttySz;
    }

    /**
     * Sets the value of the nttySz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification49 setNttySz(String value) {
        this.nttySz = value;
        return this;
    }

    /**
     * Gets the value of the sctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustrySector3Choice }
     * 
     * 
     * @return
     *     The value of the sctr property.
     */
    public List<IndustrySector3Choice> getSctr() {
        if (sctr == null) {
            sctr = new ArrayList<>();
        }
        return this.sctr;
    }

    /**
     * Gets the value of the prsnNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prsnNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrsnNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the prsnNm property.
     */
    public List<String> getPrsnNm() {
        if (prsnNm == null) {
            prsnNm = new ArrayList<>();
        }
        return this.prsnNm;
    }

    /**
     * Gets the value of the npi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPI() {
        return npi;
    }

    /**
     * Sets the value of the npi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification49 setNPI(String value) {
        this.npi = value;
        return this;
    }

    /**
     * Gets the value of the nttyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNttyTp() {
        return nttyTp;
    }

    /**
     * Sets the value of the nttyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification49 setNttyTp(String value) {
        this.nttyTp = value;
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
     * Adds a new item to the orgNm list.
     * @see #getOrgNm()
     * 
     */
    public OrganisationIdentification49 addOrgNm(PartyName5 orgNm) {
        getOrgNm().add(orgNm);
        return this;
    }

    /**
     * Adds a new item to the altrnOrgId list.
     * @see #getAltrnOrgId()
     * 
     */
    public OrganisationIdentification49 addAltrnOrgId(GenericOrganisationIdentification3 altrnOrgId) {
        getAltrnOrgId().add(altrnOrgId);
        return this;
    }

    /**
     * Adds a new item to the sctr list.
     * @see #getSctr()
     * 
     */
    public OrganisationIdentification49 addSctr(IndustrySector3Choice sctr) {
        getSctr().add(sctr);
        return this;
    }

    /**
     * Adds a new item to the prsnNm list.
     * @see #getPrsnNm()
     * 
     */
    public OrganisationIdentification49 addPrsnNm(String prsnNm) {
        getPrsnNm().add(prsnNm);
        return this;
    }

}
