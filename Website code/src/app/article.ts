import { Unite } from "./unite";
import { Under_Group } from "./underGroupArticle";
import { Brand } from "./brand";

export class Article {
    barcode!: number;
    price : number | undefined;
    qteUnite!: number;
    stock!: number;
    article_Name!: string;
    unite!: Unite;
    under_group!: Under_Group;
    brand!: Brand;
}
