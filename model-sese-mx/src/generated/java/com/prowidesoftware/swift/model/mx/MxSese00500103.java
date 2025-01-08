
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
 * Class for sese.005.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.005.001.03")
public class MxSese00500103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfInInstr", required = true)
    protected TransferInInstructionV03 trfInInstr;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 5;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference2 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, BeneficiaryCertificationCompletion1Code.class, BusinessFlowType1Code.class, Charge20 .class, ChargeBearer1Code.class, ChargeType12Code.class, Commission12 .class, CommissionType7Code.class, ContactIdentification2 .class, CopyInformation2 .class, DateAndDateTimeChoice.class, DateFormat1Choice.class, DeliverInformation5 .class, DeliveringPartiesAndAccount8 .class, DeliveryParameters4 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument13 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification27 .class, HoldingsPlanType1Code.class, IncomePreference1Code.class, Intermediary10 .class, Intermediary11 .class, InvestmentAccount22 .class, InvestmentAccount24 .class, InvestmentFundRole2Code.class, LongPostalAddress1Choice.class, MessageIdentification1 .class, MxSese00500103 .class, NameAndAddress2 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, PartyIdentification1Choice.class, PartyIdentification21 .class, PartyIdentification2Choice.class, PartyIdentificationAndAccount4 .class, PartyIdentificationAndAccount5 .class, PhysicalTransferType1Code.class, PostalAddress1 .class, SecurityIdentification3Choice.class, SettlementDate1Code.class, SimpleIdentificationInformation.class, StampDutyType2Code.class, StructuredLongPostalAddress1 .class, SubAccount1 .class, Tax15 .class, TaxType13Code.class, TaxationBasis2Code.class, TaxationBasis4Code.class, Transfer15 .class, TransferInInstructionV03 .class, TransferReason1 .class, TransferReason1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.005.001.03";

    public MxSese00500103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00500103(final String xml) {
        this();
        MxSese00500103 tmp = parse(xml);
        trfInInstr = tmp.getTrfInInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00500103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInInstr property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInInstructionV03 }
     *     
     */
    public TransferInInstructionV03 getTrfInInstr() {
        return trfInInstr;
    }

    /**
     * Sets the value of the trfInInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInInstructionV03 }
     *     
     */
    public MxSese00500103 setTrfInInstr(TransferInInstructionV03 value) {
        this.trfInInstr = value;
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
    public static MxSese00500103 parse(String xml) {
        return ((MxSese00500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00500103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00500103 parse(String xml, MxRead parserImpl) {
        return ((MxSese00500103) parserImpl.read(MxSese00500103 .class, xml, _classes));
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
     * Creates an MxSese00500103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00500103 message
     * @return
     *     a new instance of MxSese00500103
     */
    public static final MxSese00500103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00500103 .class);
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
