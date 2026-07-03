
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the acceptor configuration.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorConfigurationContent12", propOrder = {
    "rplcCfgtn",
    "tmsPrtcolParams",
    "acqrrPrtcolParams",
    "svcPrvdrParams",
    "mrchntParams",
    "termnlParams",
    "applParams",
    "hstComParams",
    "sctyParams",
    "saleToPOIParams",
    "termnlPackg"
})
public class AcceptorConfigurationContent12 {

    @XmlElement(name = "RplcCfgtn")
    protected Boolean rplcCfgtn;
    @XmlElement(name = "TMSPrtcolParams")
    protected List<TMSProtocolParameters7> tmsPrtcolParams;
    @XmlElement(name = "AcqrrPrtcolParams")
    protected List<AcquirerProtocolParameters16> acqrrPrtcolParams;
    @XmlElement(name = "SvcPrvdrParams")
    protected List<ServiceProviderParameters3> svcPrvdrParams;
    @XmlElement(name = "MrchntParams")
    protected List<MerchantConfigurationParameters6> mrchntParams;
    @XmlElement(name = "TermnlParams")
    protected List<PaymentTerminalParameters8> termnlParams;
    @XmlElement(name = "ApplParams")
    protected List<ApplicationParameters12> applParams;
    @XmlElement(name = "HstComParams")
    protected List<HostCommunicationParameter6> hstComParams;
    @XmlElement(name = "SctyParams")
    protected List<SecurityParameters15> sctyParams;
    @XmlElement(name = "SaleToPOIParams")
    protected List<SaleToPOIProtocolParameter3> saleToPOIParams;
    @XmlElement(name = "TermnlPackg")
    protected List<TerminalPackageType4> termnlPackg;

    /**
     * Gets the value of the rplcCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRplcCfgtn() {
        return rplcCfgtn;
    }

    /**
     * Sets the value of the rplcCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcceptorConfigurationContent12 setRplcCfgtn(Boolean value) {
        this.rplcCfgtn = value;
        return this;
    }

    /**
     * Gets the value of the tmsPrtcolParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmsPrtcolParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTMSPrtcolParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMSProtocolParameters7 }
     * 
     * 
     */
    public List<TMSProtocolParameters7> getTMSPrtcolParams() {
        if (tmsPrtcolParams == null) {
            tmsPrtcolParams = new ArrayList<TMSProtocolParameters7>();
        }
        return this.tmsPrtcolParams;
    }

    /**
     * Gets the value of the acqrrPrtcolParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acqrrPrtcolParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcqrrPrtcolParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcquirerProtocolParameters16 }
     * 
     * 
     */
    public List<AcquirerProtocolParameters16> getAcqrrPrtcolParams() {
        if (acqrrPrtcolParams == null) {
            acqrrPrtcolParams = new ArrayList<AcquirerProtocolParameters16>();
        }
        return this.acqrrPrtcolParams;
    }

    /**
     * Gets the value of the svcPrvdrParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcPrvdrParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcPrvdrParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProviderParameters3 }
     * 
     * 
     */
    public List<ServiceProviderParameters3> getSvcPrvdrParams() {
        if (svcPrvdrParams == null) {
            svcPrvdrParams = new ArrayList<ServiceProviderParameters3>();
        }
        return this.svcPrvdrParams;
    }

    /**
     * Gets the value of the mrchntParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrchntParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrchntParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerchantConfigurationParameters6 }
     * 
     * 
     */
    public List<MerchantConfigurationParameters6> getMrchntParams() {
        if (mrchntParams == null) {
            mrchntParams = new ArrayList<MerchantConfigurationParameters6>();
        }
        return this.mrchntParams;
    }

    /**
     * Gets the value of the termnlParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termnlParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermnlParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerminalParameters8 }
     * 
     * 
     */
    public List<PaymentTerminalParameters8> getTermnlParams() {
        if (termnlParams == null) {
            termnlParams = new ArrayList<PaymentTerminalParameters8>();
        }
        return this.termnlParams;
    }

    /**
     * Gets the value of the applParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationParameters12 }
     * 
     * 
     */
    public List<ApplicationParameters12> getApplParams() {
        if (applParams == null) {
            applParams = new ArrayList<ApplicationParameters12>();
        }
        return this.applParams;
    }

    /**
     * Gets the value of the hstComParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hstComParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHstComParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostCommunicationParameter6 }
     * 
     * 
     */
    public List<HostCommunicationParameter6> getHstComParams() {
        if (hstComParams == null) {
            hstComParams = new ArrayList<HostCommunicationParameter6>();
        }
        return this.hstComParams;
    }

    /**
     * Gets the value of the sctyParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctyParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityParameters15 }
     * 
     * 
     */
    public List<SecurityParameters15> getSctyParams() {
        if (sctyParams == null) {
            sctyParams = new ArrayList<SecurityParameters15>();
        }
        return this.sctyParams;
    }

    /**
     * Gets the value of the saleToPOIParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleToPOIParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleToPOIParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleToPOIProtocolParameter3 }
     * 
     * 
     */
    public List<SaleToPOIProtocolParameter3> getSaleToPOIParams() {
        if (saleToPOIParams == null) {
            saleToPOIParams = new ArrayList<SaleToPOIProtocolParameter3>();
        }
        return this.saleToPOIParams;
    }

    /**
     * Gets the value of the termnlPackg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termnlPackg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermnlPackg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalPackageType4 }
     * 
     * 
     */
    public List<TerminalPackageType4> getTermnlPackg() {
        if (termnlPackg == null) {
            termnlPackg = new ArrayList<TerminalPackageType4>();
        }
        return this.termnlPackg;
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
     * Adds a new item to the tMSPrtcolParams list.
     * @see #getTMSPrtcolParams()
     * 
     */
    public AcceptorConfigurationContent12 addTMSPrtcolParams(TMSProtocolParameters7 tMSPrtcolParams) {
        getTMSPrtcolParams().add(tMSPrtcolParams);
        return this;
    }

    /**
     * Adds a new item to the acqrrPrtcolParams list.
     * @see #getAcqrrPrtcolParams()
     * 
     */
    public AcceptorConfigurationContent12 addAcqrrPrtcolParams(AcquirerProtocolParameters16 acqrrPrtcolParams) {
        getAcqrrPrtcolParams().add(acqrrPrtcolParams);
        return this;
    }

    /**
     * Adds a new item to the svcPrvdrParams list.
     * @see #getSvcPrvdrParams()
     * 
     */
    public AcceptorConfigurationContent12 addSvcPrvdrParams(ServiceProviderParameters3 svcPrvdrParams) {
        getSvcPrvdrParams().add(svcPrvdrParams);
        return this;
    }

    /**
     * Adds a new item to the mrchntParams list.
     * @see #getMrchntParams()
     * 
     */
    public AcceptorConfigurationContent12 addMrchntParams(MerchantConfigurationParameters6 mrchntParams) {
        getMrchntParams().add(mrchntParams);
        return this;
    }

    /**
     * Adds a new item to the termnlParams list.
     * @see #getTermnlParams()
     * 
     */
    public AcceptorConfigurationContent12 addTermnlParams(PaymentTerminalParameters8 termnlParams) {
        getTermnlParams().add(termnlParams);
        return this;
    }

    /**
     * Adds a new item to the applParams list.
     * @see #getApplParams()
     * 
     */
    public AcceptorConfigurationContent12 addApplParams(ApplicationParameters12 applParams) {
        getApplParams().add(applParams);
        return this;
    }

    /**
     * Adds a new item to the hstComParams list.
     * @see #getHstComParams()
     * 
     */
    public AcceptorConfigurationContent12 addHstComParams(HostCommunicationParameter6 hstComParams) {
        getHstComParams().add(hstComParams);
        return this;
    }

    /**
     * Adds a new item to the sctyParams list.
     * @see #getSctyParams()
     * 
     */
    public AcceptorConfigurationContent12 addSctyParams(SecurityParameters15 sctyParams) {
        getSctyParams().add(sctyParams);
        return this;
    }

    /**
     * Adds a new item to the saleToPOIParams list.
     * @see #getSaleToPOIParams()
     * 
     */
    public AcceptorConfigurationContent12 addSaleToPOIParams(SaleToPOIProtocolParameter3 saleToPOIParams) {
        getSaleToPOIParams().add(saleToPOIParams);
        return this;
    }

    /**
     * Adds a new item to the termnlPackg list.
     * @see #getTermnlPackg()
     * 
     */
    public AcceptorConfigurationContent12 addTermnlPackg(TerminalPackageType4 termnlPackg) {
        getTermnlPackg().add(termnlPackg);
        return this;
    }

}
