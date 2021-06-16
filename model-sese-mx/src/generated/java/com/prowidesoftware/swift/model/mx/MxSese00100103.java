
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.001.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfOutInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.001.001.03")
public class MxSese00100103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfOutInstr", required = true)
    protected TransferOutInstructionV03 trfOutInstr;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference2 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, BeneficiaryCertificationCompletion1Code.class, BusinessFlowType1Code.class, Charge20 .class, ChargeBearer1Code.class, ChargeType12Code.class, Commission12 .class, CommissionType7Code.class, ContactIdentification2 .class, CopyInformation2 .class, DateAndDateTimeChoice.class, DateFormat1Choice.class, DeliveryParameters4 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument13 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification27 .class, HoldingsPlanType1Code.class, IncomePreference1Code.class, Intermediary10 .class, Intermediary11 .class, InvestmentAccount22 .class, InvestmentAccount24 .class, InvestmentFundRole2Code.class, LongPostalAddress1Choice.class, MessageIdentification1 .class, MxSese00100103 .class, NameAndAddress2 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, PartyIdentification1Choice.class, PartyIdentification21 .class, PartyIdentification2Choice.class, PartyIdentificationAndAccount4 .class, PartyIdentificationAndAccount5 .class, PhysicalTransferType1Code.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, Quantity13Choice.class, ReceiveInformation5 .class, ReceivingPartiesAndAccount8 .class, RoundingDirection2Code.class, SecurityIdentification3Choice.class, SettlementDate1Code.class, SimpleIdentificationInformation.class, StampDutyType2Code.class, StructuredLongPostalAddress1 .class, SubAccount1 .class, Tax15 .class, TaxType13Code.class, TaxationBasis2Code.class, TaxationBasis4Code.class, Transfer11 .class, TransferOutInstructionV03 .class, TransferReason1 .class, TransferReason1Code.class, TypeOfPrice12Code.class, UKTaxGroupUnitCode.class, Unit3 .class, UnitPrice12 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.001.001.03";

    public MxSese00100103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00100103(final String xml) {
        this();
        MxSese00100103 tmp = parse(xml);
        trfOutInstr = tmp.getTrfOutInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00100103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfOutInstr property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOutInstructionV03 }
     *     
     */
    public TransferOutInstructionV03 getTrfOutInstr() {
        return trfOutInstr;
    }

    /**
     * Sets the value of the trfOutInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOutInstructionV03 }
     *     
     */
    public MxSese00100103 setTrfOutInstr(TransferOutInstructionV03 value) {
        this.trfOutInstr = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese00100103 parse(String xml) {
        return ((MxSese00100103) MxReadImpl.parse(MxSese00100103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00100103 parse(String xml, MxRead parserImpl) {
        return ((MxSese00100103) parserImpl.read(MxSese00100103 .class, xml, _classes));
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
     * Creates an MxSese00100103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00100103 message
     * @return
     *     a new instance of MxSese00100103
     */
    public final static MxSese00100103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00100103 .class);
    }

}
