
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for setr.016.000.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "setr01600001"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.016.000.01")
public class MxSetr01600001
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "setr.016.000.01", required = true)
    protected Setr01600001 setr01600001;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 0;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CancelledStatus2 .class, CancelledStatusReason2Code.class, Charge19 .class, ChargeType11Code.class, Commission11 .class, CommissionType6Code.class, ConditionallyAcceptedStatus2 .class, ConditionallyAcceptedStatusReason2 .class, ConditionallyAcceptedStatusReason2Code.class, DateAndDateTimeChoice.class, DeliveryReceiptType2Code.class, DistributionPolicy1Code.class, ExpectedExecutionDetails2 .class, Extension1 .class, FinancialInstrument10 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, FundOrderData1 .class, FundOrderData2 .class, GenericIdentification1 .class, InRepairStatus2 .class, InRepairStatusReason1Code.class, InRepairStatusReason3 .class, IndividualOrderStatusAndReason2 .class, InvestmentAccount13 .class, MessageIdentification1 .class, MxSetr01600001 .class, NameAndAddress5 .class, NoReasonCode.class, OrderStatus4Code.class, OrderStatusAndReason7 .class, PartiallySettledStatus1 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectedStatus6 .class, RejectedStatusReason7Code.class, RepairedConditions3 .class, SecurityIdentification3Choice.class, Setr01600001 .class, SettledStatusReason1Code.class, SimpleIdentificationInformation.class, SuspendedStatus2 .class, SuspendedStatusReason2 .class, SuspendedStatusReason3Code.class, SwitchLegReferences1 .class, SwitchOrderStatusAndReason1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:setr.016.000.01";

    public MxSetr01600001() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01600001(final String xml) {
        this();
        MxSetr01600001 tmp = parse(xml);
        setr01600001 = tmp.getSetr01600001();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01600001(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the setr01600001 property.
     * 
     * @return
     *     possible object is
     *     {@link Setr01600001 }
     *     
     */
    public Setr01600001 getSetr01600001() {
        return setr01600001;
    }

    /**
     * Sets the value of the setr01600001 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Setr01600001 }
     *     
     */
    public MxSetr01600001 setSetr01600001(Setr01600001 value) {
        this.setr01600001 = value;
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
    public static MxSetr01600001 parse(String xml) {
        return ((MxSetr01600001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01600001 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01600001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01600001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01600001 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01600001) parserImpl.read(MxSetr01600001 .class, xml, _classes));
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
     * Creates an MxSetr01600001 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01600001 message
     * @return
     *     a new instance of MxSetr01600001
     */
    public final static MxSetr01600001 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01600001 .class);
    }

}
