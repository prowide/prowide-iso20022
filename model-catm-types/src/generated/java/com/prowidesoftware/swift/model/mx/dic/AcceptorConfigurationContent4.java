
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
@XmlType(name = "AcceptorConfigurationContent4", propOrder = {
    "tmsPrtcolParams",
    "acqrrPrtcolParams",
    "mrchntParams",
    "termnlParams",
    "applParams",
    "hstComParams",
    "sctyParams"
})
public class AcceptorConfigurationContent4 {

    @XmlElement(name = "TMSPrtcolParams")
    protected List<TMSProtocolParameters1> tmsPrtcolParams;
    @XmlElement(name = "AcqrrPrtcolParams")
    protected List<AcquirerProtocolParameters7> acqrrPrtcolParams;
    @XmlElement(name = "MrchntParams")
    protected List<MerchantConfigurationParameters1> mrchntParams;
    @XmlElement(name = "TermnlParams")
    protected List<PaymentTerminalParameters2> termnlParams;
    @XmlElement(name = "ApplParams")
    protected List<ApplicationParameters4> applParams;
    @XmlElement(name = "HstComParams")
    protected List<HostCommunicationParameter3> hstComParams;
    @XmlElement(name = "SctyParams")
    protected List<SecurityParameters3> sctyParams;

    /**
     * Gets the value of the tmsPrtcolParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tmsPrtcolParams property.
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
     * {@link TMSProtocolParameters1 }
     * 
     * 
     * @return
     *     The value of the tmsPrtcolParams property.
     */
    public List<TMSProtocolParameters1> getTMSPrtcolParams() {
        if (tmsPrtcolParams == null) {
            tmsPrtcolParams = new ArrayList<>();
        }
        return this.tmsPrtcolParams;
    }

    /**
     * Gets the value of the acqrrPrtcolParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acqrrPrtcolParams property.
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
     * {@link AcquirerProtocolParameters7 }
     * 
     * 
     * @return
     *     The value of the acqrrPrtcolParams property.
     */
    public List<AcquirerProtocolParameters7> getAcqrrPrtcolParams() {
        if (acqrrPrtcolParams == null) {
            acqrrPrtcolParams = new ArrayList<>();
        }
        return this.acqrrPrtcolParams;
    }

    /**
     * Gets the value of the mrchntParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrchntParams property.
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
     * {@link MerchantConfigurationParameters1 }
     * 
     * 
     * @return
     *     The value of the mrchntParams property.
     */
    public List<MerchantConfigurationParameters1> getMrchntParams() {
        if (mrchntParams == null) {
            mrchntParams = new ArrayList<>();
        }
        return this.mrchntParams;
    }

    /**
     * Gets the value of the termnlParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the termnlParams property.
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
     * {@link PaymentTerminalParameters2 }
     * 
     * 
     * @return
     *     The value of the termnlParams property.
     */
    public List<PaymentTerminalParameters2> getTermnlParams() {
        if (termnlParams == null) {
            termnlParams = new ArrayList<>();
        }
        return this.termnlParams;
    }

    /**
     * Gets the value of the applParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the applParams property.
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
     * {@link ApplicationParameters4 }
     * 
     * 
     * @return
     *     The value of the applParams property.
     */
    public List<ApplicationParameters4> getApplParams() {
        if (applParams == null) {
            applParams = new ArrayList<>();
        }
        return this.applParams;
    }

    /**
     * Gets the value of the hstComParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hstComParams property.
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
     * {@link HostCommunicationParameter3 }
     * 
     * 
     * @return
     *     The value of the hstComParams property.
     */
    public List<HostCommunicationParameter3> getHstComParams() {
        if (hstComParams == null) {
            hstComParams = new ArrayList<>();
        }
        return this.hstComParams;
    }

    /**
     * Gets the value of the sctyParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctyParams property.
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
     * {@link SecurityParameters3 }
     * 
     * 
     * @return
     *     The value of the sctyParams property.
     */
    public List<SecurityParameters3> getSctyParams() {
        if (sctyParams == null) {
            sctyParams = new ArrayList<>();
        }
        return this.sctyParams;
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
    public AcceptorConfigurationContent4 addTMSPrtcolParams(TMSProtocolParameters1 tMSPrtcolParams) {
        getTMSPrtcolParams().add(tMSPrtcolParams);
        return this;
    }

    /**
     * Adds a new item to the acqrrPrtcolParams list.
     * @see #getAcqrrPrtcolParams()
     * 
     */
    public AcceptorConfigurationContent4 addAcqrrPrtcolParams(AcquirerProtocolParameters7 acqrrPrtcolParams) {
        getAcqrrPrtcolParams().add(acqrrPrtcolParams);
        return this;
    }

    /**
     * Adds a new item to the mrchntParams list.
     * @see #getMrchntParams()
     * 
     */
    public AcceptorConfigurationContent4 addMrchntParams(MerchantConfigurationParameters1 mrchntParams) {
        getMrchntParams().add(mrchntParams);
        return this;
    }

    /**
     * Adds a new item to the termnlParams list.
     * @see #getTermnlParams()
     * 
     */
    public AcceptorConfigurationContent4 addTermnlParams(PaymentTerminalParameters2 termnlParams) {
        getTermnlParams().add(termnlParams);
        return this;
    }

    /**
     * Adds a new item to the applParams list.
     * @see #getApplParams()
     * 
     */
    public AcceptorConfigurationContent4 addApplParams(ApplicationParameters4 applParams) {
        getApplParams().add(applParams);
        return this;
    }

    /**
     * Adds a new item to the hstComParams list.
     * @see #getHstComParams()
     * 
     */
    public AcceptorConfigurationContent4 addHstComParams(HostCommunicationParameter3 hstComParams) {
        getHstComParams().add(hstComParams);
        return this;
    }

    /**
     * Adds a new item to the sctyParams list.
     * @see #getSctyParams()
     * 
     */
    public AcceptorConfigurationContent4 addSctyParams(SecurityParameters3 sctyParams) {
        getSctyParams().add(sctyParams);
        return this;
    }

}
