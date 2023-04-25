
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
 * Class for colr.007.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collPrpsl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.007.001.06")
public class MxColr00700106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollPrpsl", required = true)
    protected CollateralProposalV06 collPrpsl;
    public static final transient String BUSINESS_PROCESS = "colr";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, Agreement4 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, AlternatePartyIdentification8 .class, BlockChainAddressWallet3 .class, BlockChainAddressWallet5 .class, CashCollateral2 .class, CashCollateral3 .class, Collateral54 .class, Collateral55 .class, CollateralAccount3 .class, CollateralAccountIdentificationType3Choice.class, CollateralAccountType1Code.class, CollateralMovement12 .class, CollateralMovement13 .class, CollateralMovement6Choice.class, CollateralOwnership4 .class, CollateralProposal6Choice.class, CollateralProposal7 .class, CollateralProposalV06 .class, ContactIdentification2 .class, DateAndDateTime2Choice.class, DateCode9Choice.class, DateFormat14Choice.class, DateType2Code.class, DeliveringPartiesAndAccount19 .class, DepositType1Code.class, ExposureType11Code.class, FinancialInstrumentQuantity33Choice.class, GenericAccountIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType43Choice.class, MxColr00700106 .class, NameAndAddress13 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, Obligation9 .class, OtherCollateral9 .class, OtherIdentification1 .class, OtherTypeOfCollateral3 .class, PartyIdentification178Choice.class, PartyIdentification239Choice.class, PartyIdentification240Choice.class, PartyIdentificationAndAccount200 .class, PartyIdentificationAndAccount201 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress8 .class, Price7 .class, PriceRateOrAmount3Choice.class, PriceValueType1Code.class, Proposal6 .class, ProposalType1Code.class, ReceivingPartiesAndAccount19 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesCollateral10 .class, SecurityIdentification19 .class, SettlementDetails205 .class, SettlementParties35Choice.class, SubAccount5 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification2Code.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.007.001.06";

    public MxColr00700106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00700106(final String xml) {
        this();
        MxColr00700106 tmp = parse(xml);
        collPrpsl = tmp.getCollPrpsl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00700106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collPrpsl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalV06 }
     *     
     */
    public CollateralProposalV06 getCollPrpsl() {
        return collPrpsl;
    }

    /**
     * Sets the value of the collPrpsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalV06 }
     *     
     */
    public MxColr00700106 setCollPrpsl(CollateralProposalV06 value) {
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
    public static MxColr00700106 parse(String xml) {
        return ((MxColr00700106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00700106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr00700106 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr00700106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00700106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00700106 parse(String xml, MxRead parserImpl) {
        return ((MxColr00700106) parserImpl.read(MxColr00700106 .class, xml, _classes));
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
     * Creates an MxColr00700106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00700106 message
     * @return
     *     a new instance of MxColr00700106
     */
    public static final MxColr00700106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00700106 .class);
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
