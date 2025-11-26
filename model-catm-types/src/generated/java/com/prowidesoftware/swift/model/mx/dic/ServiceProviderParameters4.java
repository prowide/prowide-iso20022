
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Service provider parameters of the point of interaction (POI).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProviderParameters4", propOrder = {
    "actnTp",
    "svcPrvdrId",
    "vrsn",
    "applId",
    "hst",
    "nonFinActnSpprtd"
})
public class ServiceProviderParameters4 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "SvcPrvdrId", required = true)
    protected List<GenericIdentification176> svcPrvdrId;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "ApplId")
    protected List<String> applId;
    @XmlElement(name = "Hst")
    protected List<AcquirerHostConfiguration10> hst;
    @XmlElement(name = "NonFinActnSpprtd")
    @XmlSchemaType(name = "string")
    protected List<NonFinancialRequestType2Code> nonFinActnSpprtd;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public ServiceProviderParameters4 setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
        return this;
    }

    /**
     * Gets the value of the svcPrvdrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcPrvdrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcPrvdrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification176 }
     * 
     * 
     * @return
     *     The value of the svcPrvdrId property.
     */
    public List<GenericIdentification176> getSvcPrvdrId() {
        if (svcPrvdrId == null) {
            svcPrvdrId = new ArrayList<>();
        }
        return this.svcPrvdrId;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ServiceProviderParameters4 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the applId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the applId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the applId property.
     */
    public List<String> getApplId() {
        if (applId == null) {
            applId = new ArrayList<>();
        }
        return this.applId;
    }

    /**
     * Gets the value of the hst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcquirerHostConfiguration10 }
     * 
     * 
     * @return
     *     The value of the hst property.
     */
    public List<AcquirerHostConfiguration10> getHst() {
        if (hst == null) {
            hst = new ArrayList<>();
        }
        return this.hst;
    }

    /**
     * Gets the value of the nonFinActnSpprtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonFinActnSpprtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonFinActnSpprtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonFinancialRequestType2Code }
     * 
     * 
     * @return
     *     The value of the nonFinActnSpprtd property.
     */
    public List<NonFinancialRequestType2Code> getNonFinActnSpprtd() {
        if (nonFinActnSpprtd == null) {
            nonFinActnSpprtd = new ArrayList<>();
        }
        return this.nonFinActnSpprtd;
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
     * Adds a new item to the svcPrvdrId list.
     * @see #getSvcPrvdrId()
     * 
     */
    public ServiceProviderParameters4 addSvcPrvdrId(GenericIdentification176 svcPrvdrId) {
        getSvcPrvdrId().add(svcPrvdrId);
        return this;
    }

    /**
     * Adds a new item to the applId list.
     * @see #getApplId()
     * 
     */
    public ServiceProviderParameters4 addApplId(String applId) {
        getApplId().add(applId);
        return this;
    }

    /**
     * Adds a new item to the hst list.
     * @see #getHst()
     * 
     */
    public ServiceProviderParameters4 addHst(AcquirerHostConfiguration10 hst) {
        getHst().add(hst);
        return this;
    }

    /**
     * Adds a new item to the nonFinActnSpprtd list.
     * @see #getNonFinActnSpprtd()
     * 
     */
    public ServiceProviderParameters4 addNonFinActnSpprtd(NonFinancialRequestType2Code nonFinActnSpprtd) {
        getNonFinActnSpprtd().add(nonFinActnSpprtd);
        return this;
    }

}
