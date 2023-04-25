
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for setr.016.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "setr01600102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.016.001.02")
public class MxSetr01600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "setr.016.001.02", required = true)
    protected Setr01600102 setr01600102;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CancelledStatus1 .class, CancelledStatusReason1 .class, Charge11 .class, ChargeType1 .class, ChargeType6Code.class, Commission7 .class, CommissionType1 .class, CommissionType5Code.class, ConditionallyAcceptedStatus1 .class, ConditionallyAcceptedStatusReason1 .class, ConditionallyAcceptedStatusReason1Code.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, ExpectedExecutionDetails1 .class, FinancialInstrument6 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, InRepairStatus1 .class, InRepairStatusReason1 .class, IndividualOrderStatusAndReason1 .class, InvestmentAccount13 .class, InvestmentAccountOrFinancialInstrument1Choice.class, MxSetr01600102 .class, NameAndAddress5 .class, NoReasonCode.class, OrderStatus2Code.class, OrderStatusAndReason3 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectedStatus3 .class, RejectedStatusReason5Code.class, RejectedStatusReason6 .class, RepairedConditions2 .class, SecurityIdentification1Choice.class, Setr01600102 .class, SimpleIdentificationInformation.class, SuspendedStatus1 .class, SuspendedStatusReason1 .class, SuspendedStatusReason2Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:setr.016.001.02";

    public MxSetr01600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01600102(final String xml) {
        this();
        MxSetr01600102 tmp = parse(xml);
        setr01600102 = tmp.getSetr01600102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the setr01600102 property.
     * 
     * @return
     *     possible object is
     *     {@link Setr01600102 }
     *     
     */
    public Setr01600102 getSetr01600102() {
        return setr01600102;
    }

    /**
     * Sets the value of the setr01600102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Setr01600102 }
     *     
     */
    public MxSetr01600102 setSetr01600102(Setr01600102 value) {
        this.setr01600102 = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSetr01600102 parse(String xml) {
        return ((MxSetr01600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01600102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01600102 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01600102) parserImpl.read(MxSetr01600102 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSetr01600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01600102 message
     * @return
     *     a new instance of MxSetr01600102
     */
    public static final MxSetr01600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01600102 .class);
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

}
