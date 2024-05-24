
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
 * Class for colr.007.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collPrpsl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.007.001.03")
public class MxColr00700103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollPrpsl", required = true)
    protected CollateralProposalV03 collPrpsl;
    public static final transient String BUSINESS_PROCESS = "colr";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification26 .class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, Agreement2 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, AlternatePartyIdentification5 .class, CashCollateral2 .class, CashCollateral3 .class, Collateral7 .class, Collateral8 .class, CollateralAccount1 .class, CollateralAccountIdentificationType1Choice.class, CollateralAccountType1Code.class, CollateralMovement3Choice.class, CollateralMovement5 .class, CollateralMovement6 .class, CollateralOwnership1 .class, CollateralProposal3Choice.class, CollateralProposal4 .class, CollateralProposalV03 .class, ContactIdentification2 .class, DateAndDateTimeChoice.class, DateCode9Choice.class, DateFormat14Choice.class, DateType2Code.class, DeliveringPartiesAndAccount10 .class, DepositType1Code.class, ExposureType5Code.class, FinancialInstrumentQuantity1Choice.class, GenericAccountIdentification1 .class, GenericIdentification29 .class, GenericIdentification30 .class, GenericIdentification40 .class, GenericIdentification58 .class, IdentificationSource3Choice.class, IdentificationType40Choice.class, MxColr00700103 .class, NameAndAddress13 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, Obligation3 .class, OtherCollateral2 .class, OtherIdentification1 .class, OtherTypeOfCollateral2 .class, PartyIdentification32Choice.class, PartyIdentification33Choice.class, PartyIdentification34Choice.class, PartyIdentificationAndAccount102 .class, PartyIdentificationAndAccount77 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress8 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceValueType1Code.class, Proposal3 .class, ProposalType1Code.class, ReceivingPartiesAndAccount10 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat7Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText1 .class, SecuritiesAccount19 .class, SecuritiesCollateral3 .class, SecurityIdentification14 .class, SettlementDetails88 .class, SettlementParties3Choice.class, SimpleIdentificationInformation4 .class, SubAccount4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification2Code.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.007.001.03";

    public MxColr00700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00700103(final String xml) {
        this();
        MxColr00700103 tmp = parse(xml);
        collPrpsl = tmp.getCollPrpsl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collPrpsl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalV03 }
     *     
     */
    public CollateralProposalV03 getCollPrpsl() {
        return collPrpsl;
    }

    /**
     * Sets the value of the collPrpsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalV03 }
     *     
     */
    public MxColr00700103 setCollPrpsl(CollateralProposalV03 value) {
        this.collPrpsl = value;
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
    public static MxColr00700103 parse(String xml) {
        return ((MxColr00700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr00700103 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr00700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00700103 parse(String xml, MxRead parserImpl) {
        return ((MxColr00700103) parserImpl.read(MxColr00700103 .class, xml, _classes));
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
     * Creates an MxColr00700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00700103 message
     * @return
     *     a new instance of MxColr00700103
     */
    public static final MxColr00700103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00700103 .class);
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
