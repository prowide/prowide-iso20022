
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
 * Content of the acceptor configuration.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorConfigurationContent9", propOrder = {
    "rplcCfgtn",
    "tmsPrtcolParams",
    "acqrrPrtcolParams",
    "mrchntParams",
    "termnlParams",
    "applParams",
    "hstComParams",
    "sctyParams",
    "saleToPOIParams",
    "termnlPackg"
})
public class AcceptorConfigurationContent9 {

    @XmlElement(name = "RplcCfgtn")
    protected Boolean rplcCfgtn;
    @XmlElement(name = "TMSPrtcolParams")
    protected List<TMSProtocolParameters5> tmsPrtcolParams;
    @XmlElement(name = "AcqrrPrtcolParams")
    protected List<AcquirerProtocolParameters13> acqrrPrtcolParams;
    @XmlElement(name = "MrchntParams")
    protected List<MerchantConfigurationParameters5> mrchntParams;
    @XmlElement(name = "TermnlParams")
    protected List<PaymentTerminalParameters7> termnlParams;
    @XmlElement(name = "ApplParams")
    protected List<ApplicationParameters9> applParams;
    @XmlElement(name = "HstComParams")
    protected List<HostCommunicationParameter6> hstComParams;
    @XmlElement(name = "SctyParams")
    protected List<SecurityParameters12> sctyParams;
    @XmlElement(name = "SaleToPOIParams")
    protected List<SaleToPOIProtocolParameter1> saleToPOIParams;
    @XmlElement(name = "TermnlPackg")
    protected List<TerminalPackageType1> termnlPackg;

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
    public AcceptorConfigurationContent9 setRplcCfgtn(Boolean value) {
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
     * {@link TMSProtocolParameters5 }
     * 
     * 
     */
    public List<TMSProtocolParameters5> getTMSPrtcolParams() {
        if (tmsPrtcolParams == null) {
            tmsPrtcolParams = new ArrayList<TMSProtocolParameters5>();
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
     * {@link AcquirerProtocolParameters13 }
     * 
     * 
     */
    public List<AcquirerProtocolParameters13> getAcqrrPrtcolParams() {
        if (acqrrPrtcolParams == null) {
            acqrrPrtcolParams = new ArrayList<AcquirerProtocolParameters13>();
        }
        return this.acqrrPrtcolParams;
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
     * {@link MerchantConfigurationParameters5 }
     * 
     * 
     */
    public List<MerchantConfigurationParameters5> getMrchntParams() {
        if (mrchntParams == null) {
            mrchntParams = new ArrayList<MerchantConfigurationParameters5>();
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
     * {@link PaymentTerminalParameters7 }
     * 
     * 
     */
    public List<PaymentTerminalParameters7> getTermnlParams() {
        if (termnlParams == null) {
            termnlParams = new ArrayList<PaymentTerminalParameters7>();
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
     * {@link ApplicationParameters9 }
     * 
     * 
     */
    public List<ApplicationParameters9> getApplParams() {
        if (applParams == null) {
            applParams = new ArrayList<ApplicationParameters9>();
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
     * {@link SecurityParameters12 }
     * 
     * 
     */
    public List<SecurityParameters12> getSctyParams() {
        if (sctyParams == null) {
            sctyParams = new ArrayList<SecurityParameters12>();
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
     * {@link SaleToPOIProtocolParameter1 }
     * 
     * 
     */
    public List<SaleToPOIProtocolParameter1> getSaleToPOIParams() {
        if (saleToPOIParams == null) {
            saleToPOIParams = new ArrayList<SaleToPOIProtocolParameter1>();
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
     * {@link TerminalPackageType1 }
     * 
     * 
     */
    public List<TerminalPackageType1> getTermnlPackg() {
        if (termnlPackg == null) {
            termnlPackg = new ArrayList<TerminalPackageType1>();
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
    public AcceptorConfigurationContent9 addTMSPrtcolParams(TMSProtocolParameters5 tMSPrtcolParams) {
        getTMSPrtcolParams().add(tMSPrtcolParams);
        return this;
    }

    /**
     * Adds a new item to the acqrrPrtcolParams list.
     * @see #getAcqrrPrtcolParams()
     * 
     */
    public AcceptorConfigurationContent9 addAcqrrPrtcolParams(AcquirerProtocolParameters13 acqrrPrtcolParams) {
        getAcqrrPrtcolParams().add(acqrrPrtcolParams);
        return this;
    }

    /**
     * Adds a new item to the mrchntParams list.
     * @see #getMrchntParams()
     * 
     */
    public AcceptorConfigurationContent9 addMrchntParams(MerchantConfigurationParameters5 mrchntParams) {
        getMrchntParams().add(mrchntParams);
        return this;
    }

    /**
     * Adds a new item to the termnlParams list.
     * @see #getTermnlParams()
     * 
     */
    public AcceptorConfigurationContent9 addTermnlParams(PaymentTerminalParameters7 termnlParams) {
        getTermnlParams().add(termnlParams);
        return this;
    }

    /**
     * Adds a new item to the applParams list.
     * @see #getApplParams()
     * 
     */
    public AcceptorConfigurationContent9 addApplParams(ApplicationParameters9 applParams) {
        getApplParams().add(applParams);
        return this;
    }

    /**
     * Adds a new item to the hstComParams list.
     * @see #getHstComParams()
     * 
     */
    public AcceptorConfigurationContent9 addHstComParams(HostCommunicationParameter6 hstComParams) {
        getHstComParams().add(hstComParams);
        return this;
    }

    /**
     * Adds a new item to the sctyParams list.
     * @see #getSctyParams()
     * 
     */
    public AcceptorConfigurationContent9 addSctyParams(SecurityParameters12 sctyParams) {
        getSctyParams().add(sctyParams);
        return this;
    }

    /**
     * Adds a new item to the saleToPOIParams list.
     * @see #getSaleToPOIParams()
     * 
     */
    public AcceptorConfigurationContent9 addSaleToPOIParams(SaleToPOIProtocolParameter1 saleToPOIParams) {
        getSaleToPOIParams().add(saleToPOIParams);
        return this;
    }

    /**
     * Adds a new item to the termnlPackg list.
     * @see #getTermnlPackg()
     * 
     */
    public AcceptorConfigurationContent9 addTermnlPackg(TerminalPackageType1 termnlPackg) {
        getTermnlPackg().add(termnlPackg);
        return this;
    }

}
