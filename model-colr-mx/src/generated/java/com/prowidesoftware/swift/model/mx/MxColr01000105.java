
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.010.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collSbstitnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.010.001.05")
public class MxColr01000105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollSbstitnReq", required = true)
    protected CollateralSubstitutionRequestV05 collSbstitnReq;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, Agreement4 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, AlternatePartyIdentification8 .class, BlockChainAddressWallet3 .class, BlockChainAddressWallet5 .class, CashCollateral3 .class, CashCollateral5 .class, CollateralAccount3 .class, CollateralAccountIdentificationType3Choice.class, CollateralAccountType1Code.class, CollateralOwnership4 .class, CollateralSubstitution7 .class, CollateralSubstitution8 .class, CollateralSubstitutionRequestV05 .class, CollateralSubstitutionSequence1Code.class, CollateralSubstitutionType1Code.class, ContactIdentification2 .class, DateAndDateTime2Choice.class, DateCode9Choice.class, DateFormat14Choice.class, DateType2Code.class, DeliveringPartiesAndAccount19 .class, DepositType1Code.class, ExposureType11Code.class, FinancialInstrumentQuantity33Choice.class, GenericAccountIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType43Choice.class, MxColr01000105 .class, NameAndAddress13 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, Obligation9 .class, OtherCollateral11 .class, OtherCollateral9 .class, OtherIdentification1 .class, OtherTypeOfCollateral3 .class, PartyIdentification178Choice.class, PartyIdentification239Choice.class, PartyIdentification240Choice.class, PartyIdentificationAndAccount200 .class, PartyIdentificationAndAccount201 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress8 .class, Price7 .class, PriceRateOrAmount3Choice.class, PriceValueType1Code.class, ReceivingPartiesAndAccount19 .class, Reference17 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesCollateral11 .class, SecuritiesCollateral12 .class, SecurityIdentification19 .class, SettlementDetails206 .class, SettlementParties36Choice.class, SubAccount5 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification2Code.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.010.001.05";

    public MxColr01000105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01000105(final String xml) {
        this();
        MxColr01000105 tmp = parse(xml);
        collSbstitnReq = tmp.getCollSbstitnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01000105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collSbstitnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitutionRequestV05 }
     *     
     */
    public CollateralSubstitutionRequestV05 getCollSbstitnReq() {
        return collSbstitnReq;
    }

    /**
     * Sets the value of the collSbstitnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitutionRequestV05 }
     *     
     */
    public MxColr01000105 setCollSbstitnReq(CollateralSubstitutionRequestV05 value) {
        this.collSbstitnReq = value;
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
    public static MxColr01000105 parse(String xml) {
        return ((MxColr01000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr01000105 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr01000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr01000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01000105 parse(String xml, MxRead parserImpl) {
        return ((MxColr01000105) parserImpl.read(MxColr01000105 .class, xml, _classes));
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
     * Creates an MxColr01000105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01000105 message
     * @return
     *     a new instance of MxColr01000105
     */
    public final static MxColr01000105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr01000105 .class);
    }

}
