
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
@XmlType(name = "AcceptorConfigurationContent3", propOrder = {
    "acqrrPrtcolParams",
    "mrchntParams",
    "termnlParams",
    "applParams",
    "hstComParams",
    "sctyParams"
})
public class AcceptorConfigurationContent3 {

    @XmlElement(name = "AcqrrPrtcolParams")
    protected List<AcquirerProtocolParameters6> acqrrPrtcolParams;
    @XmlElement(name = "MrchntParams")
    protected List<byte[]> mrchntParams;
    @XmlElement(name = "TermnlParams")
    protected List<PaymentTerminalParameters1> termnlParams;
    @XmlElement(name = "ApplParams")
    protected List<ApplicationParameters3> applParams;
    @XmlElement(name = "HstComParams")
    protected List<HostCommunicationParameter2> hstComParams;
    @XmlElement(name = "SctyParams")
    protected List<SecurityParameters2> sctyParams;

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
     * {@link AcquirerProtocolParameters6 }
     * 
     * 
     */
    public List<AcquirerProtocolParameters6> getAcqrrPrtcolParams() {
        if (acqrrPrtcolParams == null) {
            acqrrPrtcolParams = new ArrayList<AcquirerProtocolParameters6>();
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
     * byte[]
     * 
     */
    public List<byte[]> getMrchntParams() {
        if (mrchntParams == null) {
            mrchntParams = new ArrayList<byte[]>();
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
     * {@link PaymentTerminalParameters1 }
     * 
     * 
     */
    public List<PaymentTerminalParameters1> getTermnlParams() {
        if (termnlParams == null) {
            termnlParams = new ArrayList<PaymentTerminalParameters1>();
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
     * {@link ApplicationParameters3 }
     * 
     * 
     */
    public List<ApplicationParameters3> getApplParams() {
        if (applParams == null) {
            applParams = new ArrayList<ApplicationParameters3>();
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
     * {@link HostCommunicationParameter2 }
     * 
     * 
     */
    public List<HostCommunicationParameter2> getHstComParams() {
        if (hstComParams == null) {
            hstComParams = new ArrayList<HostCommunicationParameter2>();
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
     * {@link SecurityParameters2 }
     * 
     * 
     */
    public List<SecurityParameters2> getSctyParams() {
        if (sctyParams == null) {
            sctyParams = new ArrayList<SecurityParameters2>();
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
     * Adds a new item to the acqrrPrtcolParams list.
     * @see #getAcqrrPrtcolParams()
     * 
     */
    public AcceptorConfigurationContent3 addAcqrrPrtcolParams(AcquirerProtocolParameters6 acqrrPrtcolParams) {
        getAcqrrPrtcolParams().add(acqrrPrtcolParams);
        return this;
    }

    /**
     * Adds a new item to the mrchntParams list.
     * @see #getMrchntParams()
     * 
     */
    public AcceptorConfigurationContent3 addMrchntParams(byte[] mrchntParams) {
        getMrchntParams().add(mrchntParams);
        return this;
    }

    /**
     * Adds a new item to the termnlParams list.
     * @see #getTermnlParams()
     * 
     */
    public AcceptorConfigurationContent3 addTermnlParams(PaymentTerminalParameters1 termnlParams) {
        getTermnlParams().add(termnlParams);
        return this;
    }

    /**
     * Adds a new item to the applParams list.
     * @see #getApplParams()
     * 
     */
    public AcceptorConfigurationContent3 addApplParams(ApplicationParameters3 applParams) {
        getApplParams().add(applParams);
        return this;
    }

    /**
     * Adds a new item to the hstComParams list.
     * @see #getHstComParams()
     * 
     */
    public AcceptorConfigurationContent3 addHstComParams(HostCommunicationParameter2 hstComParams) {
        getHstComParams().add(hstComParams);
        return this;
    }

    /**
     * Adds a new item to the sctyParams list.
     * @see #getSctyParams()
     * 
     */
    public AcceptorConfigurationContent3 addSctyParams(SecurityParameters2 sctyParams) {
        getSctyParams().add(sctyParams);
        return this;
    }

}
