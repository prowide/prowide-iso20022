
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.007.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collPrpsl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.007.001.04")
public class MxColr00700104
    extends AbstractMX
{

    @XmlElement(name = "CollPrpsl", required = true)
    protected CollateralProposalV04 collPrpsl;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, Agreement4 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, AlternatePartyIdentification8 .class, CashCollateral2 .class, CashCollateral3 .class, Collateral11 .class, Collateral12 .class, CollateralAccount2 .class, CollateralAccountIdentificationType2Choice.class, CollateralAccountType1Code.class, CollateralMovement4Choice.class, CollateralMovement7 .class, CollateralMovement8 .class, CollateralOwnership2 .class, CollateralProposal4Choice.class, CollateralProposal5 .class, CollateralProposalV04 .class, ContactIdentification2 .class, DateAndDateTimeChoice.class, DateCode9Choice.class, DateFormat14Choice.class, DateType2Code.class, DeliveringPartiesAndAccount15 .class, DepositType1Code.class, ExposureType5Code.class, FinancialInstrumentQuantity1Choice.class, GenericAccountIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType43Choice.class, MxColr00700104 .class, NameAndAddress13 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, Obligation4 .class, OtherCollateral5 .class, OtherIdentification1 .class, OtherTypeOfCollateral2 .class, PartyIdentification100Choice.class, PartyIdentification101Choice.class, PartyIdentification102Choice.class, PartyIdentificationAndAccount126 .class, PartyIdentificationAndAccount127 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress8 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceValueType1Code.class, Proposal4 .class, ProposalType1Code.class, ReceivingPartiesAndAccount15 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat10Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesCollateral5 .class, SecurityIdentification19 .class, SettlementDetails102 .class, SettlementParties5Choice.class, SubAccount5 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification2Code.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.007.001.04";

    public MxColr00700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00700104(final String xml) {
        this();
        MxColr00700104 tmp = parse(xml);
        collPrpsl = tmp.getCollPrpsl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collPrpsl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalV04 }
     *     
     */
    public CollateralProposalV04 getCollPrpsl() {
        return collPrpsl;
    }

    /**
     * Sets the value of the collPrpsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalV04 }
     *     
     */
    public MxColr00700104 setCollPrpsl(CollateralProposalV04 value) {
        this.collPrpsl = value;
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
    public static MxColr00700104 parse(String xml) {
        return ((MxColr00700104) MxReadImpl.parse(MxColr00700104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00700104 parse(String xml, MxRead parserImpl) {
        return ((MxColr00700104) parserImpl.read(MxColr00700104 .class, xml, _classes));
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
     * Creates an MxColr00700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00700104 message
     * @return
     *     a new instance of MxColr00700104
     */
    public final static MxColr00700104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxColr00700104 .class);
    }

}
